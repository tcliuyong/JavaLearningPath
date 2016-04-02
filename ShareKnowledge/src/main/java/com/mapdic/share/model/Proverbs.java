package com.mapdic.share.model;
import java.io.Serializable;
import java.util.Date;
/**
 * Created by liuyong on 2016/4/1.
 */
public class Proverbs implements Serializable {
    private int id;
    private String word;
    private Date time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
