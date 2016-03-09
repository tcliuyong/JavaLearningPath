package com.spring.mains;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

/**
 * Created by liuyong on 2016/3/9.
 */
public class Internationalization {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("PersonBean.xml");
        Object[] objects = new Object[]{"tcliuyong", new Date()};

        String msg = applicationContext.getMessage("person",objects, Locale.CHINA);
        System.out.println(msg);
    }
}
