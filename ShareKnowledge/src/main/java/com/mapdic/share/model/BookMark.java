package com.mapdic.share.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyong on 2016/3/31.
 */
public class BookMark implements Serializable {
    private int id;
    private String bookmark;
    private String description;
    private User user;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookmark() {
        return bookmark;
    }

    public void setBookmark(String bookmark) {
        this.bookmark = bookmark;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "BookMark{" +
                "id=" + id +
                ", bookmark='" + bookmark + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", date=" + date +
                '}';
    }
}
