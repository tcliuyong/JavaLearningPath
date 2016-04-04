package com.mapdic.share.controller;

import com.baidu.ueditor.um.Uploader;
import com.mapdic.share.common.EnumCode;
import com.mapdic.share.common.ModelToDTO;
import com.mapdic.share.controller.dto.KnowledgeDTO;
import com.mapdic.share.controller.dto.KnowledgeListDTO;
import com.mapdic.share.model.Knowledge;
import com.mapdic.share.model.User;
import com.mapdic.share.serviceimpl.KnowledgeServiceImpl;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
    @ResponseBody
    @RequestMapping(value ="/addKnowledge")
    public String addKnowledge(@RequestBody Knowledge knowledge, HttpServletResponse response){
        if(knowledge != null){
            knowledge.setDate(new Date());
            knowledgeServiceImpl.addKnowledge(knowledge);
            return EnumCode.OK.getName();
        }
        return EnumCode.FAIL.getName();
    }
    @RequestMapping(value ="/imageUp")
    public void  imageUp(@RequestParam HttpServletRequest request, @RequestParam HttpServletResponse response) throws Exception {
        Uploader up = new Uploader(request);
        up.setSavePath("upload");
        String[] fileType = {".gif" , ".png" , ".jpg" , ".jpeg" , ".bmp"};
        up.setAllowFiles(fileType);
        up.setMaxSize(10000); //单位KB
        up.upload();
        String callback = request.getParameter("callback");
        String result = "{\"name\":\""+ up.getFileName() +"\", \"originalName\": \""+ up.getOriginalName() +"\", \"size\": "+ up.getSize() +", \"state\": \""+ up.getState() +"\", \"type\": \""+ up.getType() +"\", \"url\": \""+ up.getUrl() +"\"}";
        result = result.replaceAll( "\\\\", "\\\\" );
        if( callback == null ){
            response.getWriter().print( result );
        }else{
            response.getWriter().print("<script>"+ callback +"(" + result + ")</script>");
        }
    }
    @ResponseBody
    @RequestMapping(value ="/getKnowledgeListByPage")
    public List<KnowledgeDTO> getKnowledgeListByPage(@RequestBody KnowledgeListDTO knowledgeListDTO){
        List<Knowledge> knowledges = knowledgeServiceImpl.getKnowledgeByPage(knowledgeListDTO.getUid(),
                knowledgeListDTO.getPage(), knowledgeListDTO.getPagesize());

        List<KnowledgeDTO> knowledgeDTOs =new ArrayList<>();
        for(Knowledge knowledge : knowledges){
            knowledgeDTOs.add(ModelToDTO.conKnowledgeToKnowledgeDTO(knowledge));
        }
        return knowledgeDTOs;
    }

}
