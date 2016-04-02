package com.mapdic.share.controller.dto;

import com.mapdic.share.model.BookMark;
import com.mapdic.share.model.Knowledge;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liuyong on 2016/3/31.
 */
public class OverviewUserDTO implements Serializable {
    private int uid;
    private String userName;
    private String face;
    private String word;
    private int countKnowledge;
    private int countBookmark;
    private List<KnowledgeDTO> top5KnowledgeList;
    public String getUserName() {
        return userName;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCountKnowledge() {
        return countKnowledge;
    }

    public void setCountKnowledge(int countKnowledge) {
        this.countKnowledge = countKnowledge;
    }

    public int getCountBookmark() {
        return countBookmark;
    }

    public void setCountBookmark(int countBookmark) {
        this.countBookmark = countBookmark;
    }

    public List<KnowledgeDTO> getTop5KnowledgeList() {
        return top5KnowledgeList;
    }

    public void setTop5KnowledgeList(List<KnowledgeDTO> top5KnowledgeList) {
        this.top5KnowledgeList = top5KnowledgeList;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
