package com.mapdic.share.dao;

import com.mapdic.share.model.Token;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by liuyong on 2016/3/28.
 */
@Repository
public interface TokenDao {
    Token getTokenByKeepAlive(@Param(value = "token") String token);
    void addToken(Token token);
}
