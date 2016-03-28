package com.mapdic.share.service;

import com.mapdic.share.model.Token;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liuyong on 2016/3/28.
 */
public interface TokenService {
    Token getTokenByKeepAlive(String token);
    void addToken(Token token);
}
