package com.mapdic.share.model;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by liuyong on 2016/5/22.
 */
public class SearchLog {
    private int id;
    private String ip;
    private String visitKeyword;
    private Date visitTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getVisitKeyword() {
        return visitKeyword;
    }

    public void setVisitKeyword(String visitKeyword) {
        this.visitKeyword = visitKeyword;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    @Override
    public String toString() {
        return "SearchLog{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", visitKeyword='" + visitKeyword + '\'' +
                ", visitTime=" + visitTime +
                '}';
    }
}
