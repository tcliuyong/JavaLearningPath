package com.mapdic.share.model;

import java.io.Serializable;

/**
 * Created by liuyong on 2016/3/16.
 */

public class Language implements Serializable {
    private static final long serialVersionUID = 9033462647933739998L;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Language() {
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
