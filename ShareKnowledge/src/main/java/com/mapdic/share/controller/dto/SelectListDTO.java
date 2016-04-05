package com.mapdic.share.controller.dto;

import com.mapdic.share.model.Category;
import com.mapdic.share.model.Language;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liuyong on 2016/4/5.
 */
public class SelectListDTO implements Serializable {
    private List<Category > categoryList;
    private List<Language> languageList;

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public List<Language> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<Language> languageList) {
        this.languageList = languageList;
    }

    public SelectListDTO(List<Category> categoryList, List<Language> languageList) {
        this.categoryList = categoryList;
        this.languageList = languageList;
    }
}
