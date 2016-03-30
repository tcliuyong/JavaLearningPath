package com.mapdic.share.dao;

import com.mapdic.share.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by liuyong on 2016/3/9.
 */
@Repository
public interface UserDao {
     List<User> getAllUser();
     User login(User user);
     int addUser(User user);
     int updateUser(User user);
     int deleteUser(@Param("id") Integer id);
     User getUserById(@Param("id") Integer id);
     User getUserByUserName(@Param("username") String username);
     User getUserByMail(@Param("mail") String mail);
}
