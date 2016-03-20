package com.mapdic.share.serviceimpl;

import com.mapdic.share.dao.UserDao;
import com.mapdic.share.model.User;
import com.mapdic.share.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liuyong on 2016/3/10.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    public User login(User user) {
        User usr = userDao.login(user);
        return usr;
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public User getUserById(Integer id) {
        User user = userDao.getUserById(id);
        if(user != null){
            return user;
        }
        return null;
    }

}
