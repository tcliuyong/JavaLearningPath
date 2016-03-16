package com.mapdic.share.dao;

import com.mapdic.share.model.User;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by liuyong on 2016/3/9.
 */
@Repository
public interface UserDao {
     List<User> getAllUser();
}
