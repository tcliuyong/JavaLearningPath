package test;

import com.mapdic.share.dao.KnowledgeDao;
import com.mapdic.share.dao.UserDao;
import com.mapdic.share.model.User;
import com.mapdic.share.service.UserService;
import com.mapdic.share.serviceimpl.LanguageServiceImpl;
import com.mapdic.share.serviceimpl.UserServiceImpl;
import org.junit.Test;
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
public class UserTest {
    @Resource
    UserDao userDao;
    @Resource
    UserServiceImpl userService;
    @Resource
    LanguageServiceImpl languageServiceImpl;
    @org.junit.Test
    public void test(){
       List<User> users =  userService.getAllUser();
        for(User u : users){
            System.out.println(u.getUserName());
        }
        User user = new User();
        user.setUserName("tcliuyong");
        user.setPassWd("ly125512240");
        System.out.println(userService.login(user).getIC());
        System.out.println(userService.getUserByUserName("liuyong1"));
    }
    @Test
    public void addUser(){
        User user = new User();
        user.setUserName("liuyong");
        user.setPassWd("1");
//        user.setIC("23090219999");
//        user.setPhone("18345040200");
//        user.setMail("tcliuyong@163.com");
        System.out.println();
        System.out.println(userService.addUser(user));
    }
    @Test
    public void updateUser(){
        User user = new User();
        user.setId(4);
        user.setUserName("liuyong");
        user.setPassWd("1");
//        user.setIC("23090219999");
//        user.setPhone("18345040200");
        user.setMail("tcliuyong@sina1.com");
        userService.updateUser(user);
    }
    @Test
    public void deleteUser(){
        userService.deleteUser(4);
    }
    @Test
    public void getUserById(){
        User user =userDao.getUserById(200);
        System.out.println();
        if(user == null)
            System.out.println("Fail");
        else
            System.out.println(user.toString());
    }

}
