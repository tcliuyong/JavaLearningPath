package com.mapdic.share.controller;

import com.mapdic.share.model.User;
import com.mapdic.share.serviceimpl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by liuyong on 2016/3/10.
 */
@Controller
public class UserController {
    @Resource
    private UserServiceImpl userServiceImpl;
    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    public ModelAndView getAllUser(HttpServletRequest request, PrintWriter out){
        List<User> users = userServiceImpl.getAllUser();
        System.out.println(request.getParameter("username"));
        String s = request.getParameter("username");
        ModelAndView modelAndView = new ModelAndView("getAllUser");
        modelAndView.addObject("username",s);
        return modelAndView;
    }
}
