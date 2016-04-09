package com.mapdic.share.controller.dto;

import com.mapdic.share.model.User;

import java.io.Serializable;

/**
 * Created by liuyong on 2016/4/9.
 */
public class KnowledgeSearchDTO implements Serializable {
    private int k_id;
    private String tag;
    private String content;
    private String orcontent;
    private String category;
    private String language;
    private String title;
    private String system;

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

    public void setContent(String content) {
        this.content = content;
    }

    public String getOrcontent() {
        return orcontent;
    }

    public void setOrcontent(String orcontent) {
        this.orcontent = orcontent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public String toString() {
        return "KnowledgeSearchDTO{" +
                "k_id=" + k_id +
                ", tag='" + tag + '\'' +
                ", content='" + content + '\'' +
                ", orcontent='" + orcontent + '\'' +
                ", category='" + category + '\'' +
                ", language='" + language + '\'' +
                ", title='" + title + '\'' +
                ", system='" + system + '\'' +
                '}';
    }
}
