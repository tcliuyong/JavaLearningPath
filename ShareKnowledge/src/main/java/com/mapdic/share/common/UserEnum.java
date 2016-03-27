package com.mapdic.share.common;

/**
 * Created by liuyong on 2016/3/27.
 */
public enum UserEnum {
    USERNAME(-1, "UserName"), MAIL(-2, "Mail"), OK(1, "OK"),FAIL(0,"FAIL");
    private int id;
    private String name;

    UserEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
