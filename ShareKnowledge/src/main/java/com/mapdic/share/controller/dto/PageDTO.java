package com.mapdic.share.controller.dto;

import com.mapdic.share.model.Knowledge;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liuyong on 2016/4/4.
 */
public class PageDTO implements Serializable {
    private int uid;
    private int page;
    private int pagesize;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

}
