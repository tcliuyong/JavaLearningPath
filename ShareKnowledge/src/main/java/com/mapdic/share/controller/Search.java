package com.mapdic.share.controller;

import com.mapdic.share.annotation.SystemControllerLog;
import com.mapdic.share.common.DoCookie;
import com.mapdic.share.common.LYKWA;
import com.mapdic.share.common.ModelToDTO;
import com.mapdic.share.common.UserEnum;
import com.mapdic.share.controller.dto.KnowledgeSearchDTO;
import com.mapdic.share.controller.dto.TokenKeyword;
import com.mapdic.share.model.Knowledge;
import com.mapdic.share.model.SearchLog;
import com.mapdic.share.model.Token;
import com.mapdic.share.service.SearchLogService;
import com.mapdic.share.serviceimpl.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
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

    @Resource
    SearchLogServiceImpl searchLogService;
    @ModelAttribute
    @RequestMapping(value ="/search")
    @SystemControllerLog(description = "检索内容")
    public ModelAndView search(String keyword, int category, int page, int pagesize,HttpServletRequest httpServletRequest) {
        ModelAndView modelAndView = new ModelAndView("getKnowledge");
        List<Knowledge> knowledges = new ArrayList();
        String[] arr =  keyword.split("\\s+");
        knowledges = knowledgeService.getKnowledgeByCategory(category);
        LYKWA lywa = new LYKWA();
        LinkedList<Knowledge> resKnowledge = lywa.lyKeywordAlgorithm(arr, knowledges);

        modelAndView.addObject("current",page);
        int start = (page == 1?page - 1 :(page - 1) * pagesize);
        int end = start + pagesize;
        int count = resKnowledge.size();
        if(end >= count){
            end = count;
        }
        LinkedList<KnowledgeSearchDTO> knowledgeSearchDTOs = ModelToDTO.conKnowledgeToKnowledgeSearchDTO(resKnowledge.subList(start, end));
        modelAndView.addObject("knowList", knowledgeSearchDTOs);
        modelAndView.addObject("page", count % pagesize==0?count / pagesize:count / pagesize + 1);
        modelAndView.addObject("keyword", keyword);
        return modelAndView;
    }
    @ResponseBody
    @RequestMapping(value ="/getKnowledge")
    public ModelAndView getKnowledge(int kid) {
        ModelAndView modelAndView = new ModelAndView("knowledge");
        Knowledge knowledge = knowledgeService.getKnowledgeByKid(kid);
        modelAndView.addObject("knowledge", knowledge);
        return modelAndView;
    }
}
