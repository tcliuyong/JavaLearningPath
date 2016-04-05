package com.mapdic.share.controller.dto;

import com.mapdic.share.model.Knowledge;

import java.io.Serializable;

/**
 * Created by liuyong on 2016/4/5.
 */
public class KnoUserDTO implements Serializable {
    private int id;
    private String userName;
    private String face;
    private int level;
    private String word;
    Knowledge knowledge;

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

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
}
