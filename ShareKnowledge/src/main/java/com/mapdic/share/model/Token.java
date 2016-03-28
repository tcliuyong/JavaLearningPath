package com.mapdic.share.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyong on 2016/3/28.
 */
public class Token implements Serializable {
    private int id;
    private String keepAlive;
    private Date time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(String keepAlive) {
        this.keepAlive = keepAlive;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
