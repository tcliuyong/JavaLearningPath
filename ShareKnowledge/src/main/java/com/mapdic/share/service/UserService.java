package com.mapdic.share.service;

import com.mapdic.share.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liuyong on 2016/3/10.
 */
public interface UserService {
     List<User> getAllUser();
     User login(User user);
     void addUser(User user);
     void updateUser(User user);
     void deleteUser(int id);
     User getUserById(@Param("id") Integer id);
}
