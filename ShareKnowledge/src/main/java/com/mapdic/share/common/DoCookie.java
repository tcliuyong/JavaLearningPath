package com.mapdic.share.common;

import com.mapdic.share.model.User;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuyong on 2016/3/17.
 */
public class DoCookie {
    public static void addCookie(HttpServletResponse response, User user){
        Cookie cookie = new Cookie("username",user.getUserName());
        cookie.setPath("/");
        cookie.setMaxAge(2000);
        response.addCookie(cookie);
    }
}
