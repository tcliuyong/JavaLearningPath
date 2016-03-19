package com.mapdic.share.controller;

import com.mapdic.share.serviceimpl.UserServiceImpl;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuyong on 2016/3/17.
 */
public class LoginInteceptor implements HandlerInterceptor {
    @Resource
    UserServiceImpl userService;
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

//        Cookie[] cookies = httpServletRequest.getCookies();
//        for (int i = 0; i < cookies.length; i++) {
//            if (cookies[i].getName().equalsIgnoreCase("username")) { //获取键
//                System.out.println();
//                return false;//流程中断 进行相应
//            }
//        }
//        httpServletResponse.sendRedirect("/login.jsp");
//        return true;//如果是true就进行下一个流程
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
