package com.mapdic.share.common;

import com.mapdic.share.dao.TokenDao;
import com.mapdic.share.model.Token;
import com.mapdic.share.model.User;
import com.mapdic.share.serviceimpl.TokenServiceImpl;
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
        String str = RandomCode.produceString(31);
        String code = str.substring(0, idx) + user.getId() + str.substring(idx + 1, 31);
        Cookie cookie = new Cookie("_ui",code);
        cookie.setPath("/");
        cookie.setMaxAge(3600 * 24);
        Token token = new Token();
        token.setKeepAlive(code);
        token.setTime(new Date());
        tokenDao.addToken(token);
        response.addCookie(cookie);
    }
}
