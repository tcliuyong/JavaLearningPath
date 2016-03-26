package com.mapdic.share.model;

import com.fasterxml.jackson.annotation.JsonView;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;

/**
 * Created by liuyong on 2016/3/9.
 */
public class User implements Serializable {
    public interface WithoutPasswordView {};
    private int id;
    private String userName;
    @JsonView(WithoutPasswordView.class)
    private String passWd;
    private String IC;
    private String phone;
    private String qq;
    private String mail;
    private int level;
    private static final long serialVersionUID = 8033462647933739998L;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWd='" + passWd + '\'' +
                ", IC='" + IC + '\'' +
                ", phone='" + phone + '\'' +
                ", qq='" + qq + '\'' +
                ", mail='" + mail + '\'' +
                ", level=" + level +
                '}';
    }
}
