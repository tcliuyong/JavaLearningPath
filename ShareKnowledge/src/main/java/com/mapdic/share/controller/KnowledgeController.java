package com.mapdic.share.controller;

import com.mapdic.share.common.*;
import com.mapdic.share.controller.dto.*;
import com.mapdic.share.model.Knowledge;
import com.mapdic.share.model.Token;
import com.mapdic.share.model.User;
import com.mapdic.share.serviceimpl.KnowledgeServiceImpl;
import com.mapdic.share.serviceimpl.TokenServiceImpl;
import com.mapdic.share.serviceimpl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.*;

/**
 * Created by liuyong on 2016/3/31.
 */
@Controller
public class KnowledgeController {
    @Resource
    KnowledgeServiceImpl knowledgeServiceImpl;
    @Resource
    private UserServiceImpl userServiceImpl;
    @Resource
    TokenServiceImpl tokenServiceImpl;
    Logger logger = Logger.getLogger(KnowledgeController.class);
    static final String prefix = "../uploadFile/" ;
    static final long MAXSIZE = 309600L;
    @ResponseBody
    @RequestMapping(value ="/addKnowledge")
    public int addKnowledge(@RequestBody Knowledge knowledge){
        if(knowledge != null){
            knowledge.setDate(new Date());
            knowledge.setIsCheck(1);
            knowledgeServiceImpl.addKnowledge(knowledge);
            if(knowledge.getK_id() > 0)
                return knowledge.getK_id();
        }
        return EnumCode.FAIL.getId();
    }
    @ResponseBody
    @RequestMapping(value ="/uploadFile")
    public String uploadUserFace(@RequestParam("uploadFile") MultipartFile file, HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        String path = request.getSession().getServletContext().getRealPath("uploadFile");
        String fileName = RenameUploadFile.rename(file.getOriginalFilename());
        long fileSize = file.getSize()/1024;
        if(fileSize > MAXSIZE ||CheckSuffix.checkFileSuffix(file.getOriginalFilename()) ==false){
            return EnumCode.EXCEPTION.getName();
        }
        File targetFile = new File(path, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return UserEnum.FAIL.getName();
        }
        Knowledge knowledge  = new Knowledge();

        knowledge.setK_id(Integer.parseInt(request.getParameter("id")));
        knowledge.setFilePath(prefix + fileName);
        knowledgeServiceImpl.updateKnowledge(knowledge);
        return UserEnum.OK.getName();
    }
    @ResponseBody
    @RequestMapping(value ="/getKnowledgeListByPage")
    public List<KnowledgeDTO> getKnowledgeListByPage(@RequestBody PageDTO pageDTO){
        List<Knowledge> knowledges = knowledgeServiceImpl.getKnowledgeByPage(pageDTO.getUid(),
                pageDTO.getPage(), pageDTO.getPagesize());

        List<KnowledgeDTO> knowledgeDTOs =new ArrayList<>();
        for(Knowledge knowledge : knowledges){
            knowledgeDTOs.add(ModelToDTO.conKnowledgeToKnowledgeDTO(knowledge));
        }
        return knowledgeDTOs;
    }
    @ResponseBody
    @RequestMapping(value ="/getCountKnowledge")
    public int getCountKnowledge(@RequestBody String uid){
        uid = uid.replace("=","");
        int page = knowledgeServiceImpl.countKnowledge(Integer.parseInt(uid));
        return page % 10==0 ? page/10:page/10 + 1;
    }
    @ResponseBody
    @RequestMapping(value ="/delKnowledge")
    public String delKnowledge(@RequestBody DelKnoDTO delKnoDTO){
       Token ctoken = tokenServiceImpl.getTokenByKeepAlive(delKnoDTO.getCookie());
        Date date = new Date();
        if(ctoken != null && ctoken.getTime().after(date)){
            if (knowledgeServiceImpl.delKnowledge(ctoken.getUid(), delKnoDTO.getK_id()))
            return UserEnum.OK.getName();
        }
        return UserEnum.FAIL.getName();
    }
    @ResponseBody
    @RequestMapping(value ="/updateKnowledge")
    public String updateKnowledge(@RequestBody Knowledge knowledge){
        if(knowledge != null){
            knowledge.setDate(new Date());
            knowledge.setIsCheck(1);
            knowledgeServiceImpl.updateKnowledge(knowledge);

            return EnumCode.OK.getName();
        }
        return EnumCode.FAIL.getName();
    }
    @ResponseBody
    @RequestMapping(value ="/getKnowledgeByUidKid")
    public KnoUserDTO getKnowledgeByUidKid(@RequestBody CookieKid cookieKid){
        KnoUserDTO knoUserDTO = new KnoUserDTO();
        int uid = tokenServiceImpl.getTokenByKeepAlive(cookieKid.getToken()).getUid();
        User user = userServiceImpl.getUserById(uid);
        knoUserDTO.setId(uid);
        knoUserDTO.setFace(user.getFace());
        Knowledge knowledge = knowledgeServiceImpl.getKnowledgeByUidKid(cookieKid.getKid(), uid);
        knoUserDTO.setKnowledge(knowledge);
        knoUserDTO.setLevel(user.getLevel());
        knoUserDTO.setUserName(user.getUserName());
        return knoUserDTO;
    }

}
