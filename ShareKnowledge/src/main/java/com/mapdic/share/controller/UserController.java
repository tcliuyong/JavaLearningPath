package com.mapdic.share.controller;

import com.google.common.base.Preconditions;
import com.mapdic.share.common.DoCookie;
import com.mapdic.share.common.EnumCode;
import com.mapdic.share.common.RandomCode;
import com.mapdic.share.common.UserEnum;
import com.mapdic.share.controller.dto.UserDTO;
import com.mapdic.share.model.User;
import com.mapdic.share.serviceimpl.TokenServiceImol;
import com.mapdic.share.serviceimpl.UserServiceImpl;
import org.codehaus.jackson.map.annotate.JsonView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by liuyong on 2016/3/10.
 */
@Controller
public class UserController {
    @Resource
    private UserServiceImpl userServiceImpl;
    @Resource
    TokenServiceImol tokenServiceImol;
    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    public ModelAndView getAllUser(HttpServletRequest request, PrintWriter out, HttpServletResponse response){
        List<User> users = userServiceImpl.getAllUser();
        System.out.println(request.getParameter("username"));
        String s = request.getParameter("username");
        ModelAndView modelAndView = new ModelAndView("getAllUser");
        modelAndView.addObject("username",s);
        DoCookie.addCookie(response, users.get(0));
        return modelAndView;
    }
    @ResponseBody
    @RequestMapping(value ="/login")
    public UserDTO userLogin(@RequestBody User user, HttpServletResponse response, HttpServletRequest request){
        Preconditions.checkArgument(user != null, "用户为空");
        User usr = userServiceImpl.login(user);
        if (usr != null){
            DoCookie.addCookie(response, usr);
            return new UserDTO(usr.getId(), user.getUserName(), usr.getMail(),user.getLevel());
        }
        return null;
    }
    @ResponseBody
    @RequestMapping(value ="/addUser")
    public String addUser(@RequestBody User user, HttpServletResponse response){
        Preconditions.checkArgument(user != null, "用户为空");
        if(userServiceImpl.getUserByUserName(user.getUserName()) != null){
            return UserEnum.USERNAME.getName();
        }else if(userServiceImpl.getUserByMail(user.getMail()) != null){
            return UserEnum.MAIL.getName();
        }else {
            if(userServiceImpl.addUser(user))
                return UserEnum.OK.getName();
        }
        return UserEnum.FAIL.getName();
    }
    @ResponseBody
    @RequestMapping(value ="/getUser")
    public User getUser(Integer id){
        Preconditions.checkArgument(id != null, "id无效");
        User user = userServiceImpl.getUserById(id);
        return  user;
    }

}
