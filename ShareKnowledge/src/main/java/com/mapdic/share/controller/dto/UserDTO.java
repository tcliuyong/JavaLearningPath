package com.mapdic.share.controller.dto;

import java.io.Serializable;

/**
 * Created by tcliuyong on 2016/3/26.
 */
public class UserDTO implements Serializable {
    private int id;
    private String userName;
    private String passWd;
    private String IC;
    private String phone;
    private String qq;
    private String mail;
    private int level;

    public UserDTO(int id, String userName, String mail, int level) {
        this.id = id;
        this.userName = userName;
        this.mail = mail;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
