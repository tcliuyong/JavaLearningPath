package com.mapdic.share.controller.dto;

import com.mapdic.share.model.User;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyong on 2016/4/6.
 */
public class BookMarkDTO implements Serializable {
    private int id;
    private String face;
    private String bookmark;
    private String description;
    private User user;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getBookmark() {
        return bookmark;
    }

    public void setBookmark(String bookmark) {
        this.bookmark = bookmark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
