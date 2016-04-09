package com.mapdic.share.controller;

import com.mapdic.share.common.DoCookie;
import com.mapdic.share.common.LYKWA;
import com.mapdic.share.common.ModelToDTO;
import com.mapdic.share.common.UserEnum;
import com.mapdic.share.controller.dto.KnowledgeSearchDTO;
import com.mapdic.share.controller.dto.TokenKeyword;
import com.mapdic.share.model.Knowledge;
import com.mapdic.share.model.Token;
import com.mapdic.share.serviceimpl.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by liuyong on 2016/4/8.
 */
@Controller
public class Search {

    @Resource
    private UserServiceImpl userServiceImpl;
    @Resource
    TokenServiceImpl tokenServiceImpl;
    @Resource
    DoCookie doCookie;
    @Resource
    KnowledgeServiceImpl knowledgeService;


    @ResponseBody
    @RequestMapping(value ="/search")
    public ModelAndView checkUser(String keyword, int category, int page, int pagesize) {
        ModelAndView modelAndView = new ModelAndView("getKnowledge");
        List<Knowledge> knowledges = new ArrayList();
        String[] arr =  keyword.split("s+");
        knowledges = knowledgeService.getKnowledgeByCategory(category);
        LYKWA lywa = new LYKWA();
        List<Knowledge> resKnowledge = lywa.lyKeywordAlgorithm(arr, knowledges);
        modelAndView.addObject("current",page);
        int start = (page == 1?page - 1 :(page - 1) * pagesize);
        int end = start + pagesize;
        int count = resKnowledge.size();
        if(end >= count){
            end = count;
        }

        List<KnowledgeSearchDTO> knowledgeSearchDTOs = ModelToDTO.conKnowledgeToKnowledgeSearchDTO(resKnowledge.subList(start, end));
        modelAndView.addObject("knowList", knowledgeSearchDTOs);
        modelAndView.addObject("page", count % pagesize==0?count / pagesize:count / pagesize + 1);
        modelAndView.addObject("keyword", keyword);
//
        return modelAndView;
    }
}
