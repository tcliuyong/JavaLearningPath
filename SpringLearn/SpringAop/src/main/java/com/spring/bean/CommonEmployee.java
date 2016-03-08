package com.spring.bean;

/**
 * Created by liuyong on 16-1-3.
 */
public class CommonEmployee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void signIn() {
        System.out.println(name+"已经签到了...........");
    }
}
