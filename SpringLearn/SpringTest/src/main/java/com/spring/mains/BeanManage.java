package com.spring.mains;

import com.spring.bean.Person;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Date;

/**
 * Created by liuyong on 2016/3/9.
 */
public class BeanManage {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //BeanWrapper
        Object object = Class.forName("com.spring.bean.Person").newInstance();//这个是一定要注意 要有实例
        BeanWrapper beanWrapper = new BeanWrapperImpl(object);//通过BeanWrapper来设定属性
        beanWrapper.setPropertyValue("name","tcliuyong");
        beanWrapper.setPropertyValue("age",12);
        beanWrapper.setPropertyValue("birthday",new Date());
        System.out.println(beanWrapper.getPropertyValue("name") + " " + beanWrapper.getPropertyValue("age"));

        //BeanFactory
        ClassPathResource classPathResource = new ClassPathResource("PersonBean.xml");
        XmlBeanFactory  factory = new XmlBeanFactory(classPathResource); //已经废弃不建议使用
        Person person = (Person)factory.getBean("person");
        System.out.println(person.toString());
        //ApplicationContext

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("PersonBean.xml");
        Person person1 = (Person)applicationContext.getBean("person");
        System.out.println(person1.toString());

    }
}
