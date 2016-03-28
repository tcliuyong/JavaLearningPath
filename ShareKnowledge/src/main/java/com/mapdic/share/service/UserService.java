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
     boolean addUser(User user);
     boolean updateUser(User user);
     boolean deleteUser(int id);
     User getUserById(Integer id);
     User getUserById(String token);
     User getUserByUserName(String username);
     User getUserByMail(String mail);
}
