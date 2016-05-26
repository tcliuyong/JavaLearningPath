package com.mapdic.share.common;

import com.mapdic.share.dao.TokenDao;
import com.mapdic.share.model.Token;
import com.mapdic.share.model.User;
import com.mapdic.share.serviceimpl.TokenServiceImpl;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by liuyong on 2016/3/17.
 */
@Component
public class DoCookie {
    @Resource
    TokenDao tokenDao;
    static final int idx= 5;
    public void addCookie(HttpServletResponse response, User user){
        String code = RandomCode.produceString(32);
        DateTime dateTime = new DateTime();
        dateTime = dateTime.plusDays(3);
        Cookie cookie = new Cookie("_ui",code);
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        cookie.setMaxAge(3600 * 24);
        Token token = new Token();
        token.setKeepAlive(code);
        token.setUid(user.getId());
        token.setTime(dateTime.toDate());
        tokenDao.addToken(token);
        response.addCookie(cookie);
    }
    public void clearCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("_ui",null);
        cookie.setPath("/");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
}
