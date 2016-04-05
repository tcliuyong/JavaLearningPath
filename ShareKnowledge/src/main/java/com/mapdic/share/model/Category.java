package com.mapdic.share.model;

import java.io.Serializable;

/**
 * Created by liuyong on 2016/4/5.
 */
public class Category implements Serializable {
    private int id;
    private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
