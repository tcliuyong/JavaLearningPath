package com.mapdic.share.controller;

import com.google.common.base.Preconditions;
import com.mapdic.share.common.EnumCode;
import com.mapdic.share.common.UserEnum;
import com.mapdic.share.model.User;
import com.mapdic.share.serviceimpl.TokenServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuyong on 2016/3/28.
 */
@Controller
public class TokenController {
    @Resource
    TokenServiceImpl tokenServiceImpl;
    @ResponseBody
    @RequestMapping(value ="/getToken")
    public String getToken(@RequestBody String token){
        if(tokenServiceImpl.getTokenByKeepAlive(token) != null){
            return EnumCode.FAIL.getName();
        }
        return EnumCode.OK.getName();
    }
}
