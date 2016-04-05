package com.mapdic.share.controller.dto;

import java.io.Serializable;

/**
 * Created by liuyong on 2016/4/5.
 */
public class DelKnoDTO implements Serializable{
    private String cookie;
    private int k_id;

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public int getK_id() {
        return k_id;
    }

    public void setK_id(int k_id) {
        this.k_id = k_id;
    }
}
