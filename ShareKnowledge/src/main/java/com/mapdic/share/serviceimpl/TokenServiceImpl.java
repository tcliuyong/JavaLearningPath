package com.mapdic.share.serviceimpl;

import com.mapdic.share.dao.TokenDao;
import com.mapdic.share.model.Token;
import com.mapdic.share.service.TokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liuyong on 2016/3/28.
 */
@Service
public class TokenServiceImpl implements TokenService {
    @Resource
    TokenDao tokenDao;
    public Token getTokenByKeepAlive(String token) {
        return tokenDao.getTokenByKeepAlive(token);
    }
    public void addToken(Token token) {
        tokenDao.addToken(token);
    }
}
