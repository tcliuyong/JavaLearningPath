package com.mapdic.share.dao;

import com.mapdic.share.model.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by liuyong on 2016/3/9.
 */
public interface UserDao {
    public List<User> getAllUser();
}
