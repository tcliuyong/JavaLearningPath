package com.mapdic.share.controller.dto;

import java.io.Serializable;

/**
 * Created by liuyong on 2016/4/5.
 */
public class CookieKid  implements Serializable {
    private int kid;
    private String token;

    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
