package com.spring.mains;

import com.spring.bean.AppConf;
import com.spring.dao.CarDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.UserDataHandler;

/**
 * Created by liuyong on 16-1-1.
 */
public class AppConfMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConf.class);
       // ctx.register();能够注册多个配置类
        CarDao carDao = ctx.getBean(CarDao.class);
        carDao.sayHelloWorld();
    }
}
