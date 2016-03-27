package com.mapdic.share.common;

/**
 * Created by liuyong on 15-12-26.
 */
public enum EnumCode {
    OK(1, "OK"), FAIL(-1, "FAIL"), EXCEPTION(0, "EXCEPTION");
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private EnumCode(int id, String name) {
        this.name = name;
        this.id = id;
    }
}
