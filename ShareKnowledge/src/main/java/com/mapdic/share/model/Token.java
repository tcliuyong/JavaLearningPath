package com.mapdic.share.model;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyong on 2016/3/28.
 */
public class Token implements Serializable {
    private int id;
    private String keepAlive;
    private Date time;
    private int  uid;
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

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Token{" +
                "id=" + id +
                ", keepAlive='" + keepAlive + '\'' +
                ", time=" + time +
                '}';
    }
}
