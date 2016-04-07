package com.mapdic.share.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyong on 2016/3/20.
 */
public class Knowledge implements Serializable {
    private int k_id;
    private String tag;
    private String content;
    private int language;
    private int category;
    private User user;
    private String system;
    private String filePath;
    private int isCheck;
    private  String title;
    private int isForbidden;
    private Date date;

    public int getK_id() {
        return k_id;
    }

    public void setK_id(int k_id) {
        this.k_id = k_id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContent() {
        return content;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(int isCheck) {
        this.isCheck = isCheck;
    }

    public int getIsForbidden() {
        return isForbidden;
    }

    public void setIsForbidden(int isForbidden) {
        this.isForbidden = isForbidden;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Knowledge{" +
                "k_id=" + k_id +
                ", tag='" + tag + '\'' +
                ", content='" + content + '\'' +
                ", language=" + language +
                ", category=" + category +
                ", user=" + user +
                ", system='" + system + '\'' +
                ", filePath='" + filePath + '\'' +
                ", isCheck=" + isCheck +
                ", title='" + title + '\'' +
                ", isForbidden=" + isForbidden +
                ", date=" + date +
                '}';
    }
}
