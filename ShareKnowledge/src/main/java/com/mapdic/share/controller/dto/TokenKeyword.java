package com.mapdic.share.controller.dto;

import java.io.Serializable;

/**
 * Created by liuyong on 2016/4/8.
 */
public class TokenKeyword implements Serializable {
    private String token;
    private String keyword;
    private int categoryid;
    private int page;
    private int pagesize;
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    @Override
    public String toString() {
        return "TokenKeyword{" +
                "token='" + token + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
