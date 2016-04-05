package com.mapdic.share.serviceimpl;

import com.mapdic.share.dao.CategoryDao;
import com.mapdic.share.model.Category;
import com.mapdic.share.service.CategoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liuyong on 2016/4/5.
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    CategoryDao categoryDao;
    @Override
    public List<Category> getCategory() {
        return categoryDao.getCategory();
    }

    @Override
    public String getCategoryById(Integer id) {
        return categoryDao.getCategoryById(id);
    }
}
