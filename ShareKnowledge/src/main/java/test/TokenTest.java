package test;

import com.mapdic.share.model.Token;
import com.mapdic.share.serviceimpl.TokenServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by tcliuyong on 2016/3/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class TokenTest {
    @Resource
    TokenServiceImpl tokenServiceImpl;
    @Test
    public void addToken(){
        Token token = new Token();
        token.setKeepAlive("2313123123123");
        token.setTime(new Date());
        tokenServiceImpl.addToken(token);
    }
}
