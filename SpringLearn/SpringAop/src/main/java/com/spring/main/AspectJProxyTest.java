package com.spring.main;

import com.spring.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by liuyong on 16-1-3.
 */

public class AspectJProxyTest {
    public static void main(String[] args) throws Exception{
        ApplicationContext act = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CommonEmployee e = (CommonEmployee)act.getBean("employee");
        e.signIn();
    }
}
