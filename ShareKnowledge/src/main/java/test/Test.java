package test;

import com.mapdic.share.dao.UserDao;
import com.mapdic.share.model.User;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyong on 2016/3/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class Test {
    @Resource
    UserDao userDao;
    @org.junit.Test
    public void test(){
       List<User> users =  userDao.getAllUser();
        for(User u : users){
            System.out.println(u.getUserName());
        }
    }
}
