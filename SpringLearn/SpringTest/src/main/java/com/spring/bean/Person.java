package com.spring.bean;

import java.util.Date;

/**
 * Created by liuyong on 2016/3/9.
 */
public class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    private int age;
    private Date birthday;

    public void init(){
        this.name = "tcliuyong";
        this.age = 12;
        this.birthday = new Date();
    }
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
}
