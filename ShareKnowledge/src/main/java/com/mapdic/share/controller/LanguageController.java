package com.mapdic.share.controller;

import com.mapdic.share.model.Language;
import com.mapdic.share.serviceimpl.LanguageServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

/**
 * Created by liuyong on 2016/3/16.
 */
@Controller
public class LanguageController {
    @Resource
    private LanguageServiceImpl languageService;

    @RequestMapping(value = "/getLanguages")
    public @ResponseBody Language getAllUser(HttpServletRequest request){
        System.out.println("test");
        return languageService.getLanguages().get(0);
    }


}
