package test;

import com.mapdic.share.common.DoCookie;
import com.mapdic.share.model.Token;
import com.mapdic.share.serviceimpl.TokenServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by tcliuyong on 2016/3/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class TokenTest {
    @Resource
    TokenServiceImpl tokenServiceImpl;
    @Resource
    DoCookie doCookie;
    @Test
    public void addToken(){
        Token token = new Token();
        token.setKeepAlive("2313123123123");
//        tokenServiceImpl.addToken(token);
//        doCookie.addCookie();
    }
    @Test
    public void getToken(){
        Token token =  tokenServiceImpl.getTokenByKeepAlive("2313123123123");
        System.out.println();
        System.out.printf(token.toString());
    }
    @Test
    public void test(){
        Date date = new Date();
    }
}
