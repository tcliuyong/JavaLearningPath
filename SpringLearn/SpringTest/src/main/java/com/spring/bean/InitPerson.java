package com.spring.bean;

import org.springframework.beans.factory.InitializingBean;

import java.util.Date;

/**
 * Created by liuyong on 2016/3/9.
 */
/**
 * 初始化这个方法 不用再配置文件中加入 init-method方法
 * 如果实现了InitializingBean 接口 则它的所有必须的属性被BeanFactory设置后,会自动的执行afterPropertiesSet方法
 * 推荐前一种实现方式
 */
public class InitPerson implements InitializingBean{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private String name;
    private int age;
    private Date birthday;

    public void afterPropertiesSet() throws Exception {
        this.name = "tcliuyong";
        this.age = 12;
        this.birthday = new Date();
    }

    @Override
    public String toString() {
        return "InitPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
