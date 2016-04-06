package com.mapdic.share.controller;

import com.mapdic.share.common.EnumCode;
import com.mapdic.share.common.ModelToDTO;
import com.mapdic.share.common.UserEnum;
import com.mapdic.share.controller.dto.*;
import com.mapdic.share.model.Knowledge;
import com.mapdic.share.model.Token;
import com.mapdic.share.model.User;
import com.mapdic.share.serviceimpl.KnowledgeServiceImpl;
import com.mapdic.share.serviceimpl.TokenServiceImpl;
import com.mapdic.share.serviceimpl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @ResponseBody
    @RequestMapping(value ="/addKnowledge")
    public String addKnowledge(@RequestBody Knowledge knowledge, HttpServletResponse response){
        if(knowledge != null){
            knowledge.setDate(new Date());
            knowledge.setIsCheck(1);
            knowledgeServiceImpl.addKnowledge(knowledge);
            return EnumCode.OK.getName();
        }
        return EnumCode.FAIL.getName();
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
        System.out.println(uid);
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
