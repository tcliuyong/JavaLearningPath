package test;

import com.mapdic.share.dao.UserDao;
import com.mapdic.share.model.User;
import com.mapdic.share.service.UserService;
import com.mapdic.share.serviceimpl.LanguageServiceImpl;
import com.mapdic.share.serviceimpl.UserServiceImpl;
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
    UserServiceImpl userService;
    @Resource
    LanguageServiceImpl languageServiceImpl;
    @org.junit.Test
    public void test(){
       List<User> users =  userService.getAllUser();
        for(User u : users){
            System.out.println(u.getUserName());
        }
        System.out.println(languageServiceImpl.getLanguages().get(1).getName());

    }
}
