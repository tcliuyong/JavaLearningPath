package com.mapdic.share.controller;

import com.mapdic.share.common.DoCookie;
import com.mapdic.share.common.UserEnum;
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
    public ModelAndView checkUser(String keyword, int category) {
        ModelAndView modelAndView = new ModelAndView("getKnowledge");
        List<Knowledge> knowledges = new ArrayList();
        int count = knowledgeService.countKnowledgeByCid(1);
        knowledges = knowledgeService.getKnowledgeByUserCategory(category, 1, 10);
        modelAndView.addObject("knowList", knowledges);
        modelAndView.addObject("page", count % 10==0?count / 10:count / 10 + 1);
        return modelAndView;
    }
}
