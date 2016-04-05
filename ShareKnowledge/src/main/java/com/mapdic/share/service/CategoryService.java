package com.mapdic.share.service;

import com.mapdic.share.model.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuyong on 2016/4/5.
 */
public interface CategoryService {
    List<Category> getCategory();
    String getCategoryById(Integer id);
}
