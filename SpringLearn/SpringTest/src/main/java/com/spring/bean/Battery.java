package com.spring.bean;

/**
 * Created by liuyong on 16-1-10.
 */
public class Battery {
    private String name;
    private int cap;


    public Battery(String name, int cap) {
        this.name = name;
        this.cap = cap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }
}
