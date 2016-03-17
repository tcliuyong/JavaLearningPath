package com.mapdic.share.service;

import com.mapdic.share.model.User;

import java.util.List;

/**
 * Created by liuyong on 2016/3/10.
 */
public interface UserService {
     List<User> getAllUser();
     User login(User user);
}
