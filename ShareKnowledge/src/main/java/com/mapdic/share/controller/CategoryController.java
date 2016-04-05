package com.mapdic.share.controller;

import com.mapdic.share.model.Category;
import com.mapdic.share.model.Language;
import com.mapdic.share.serviceimpl.CategoryServiceImpl;
import com.mapdic.share.serviceimpl.LanguageServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liuyong on 2016/4/5.
 */
@Controller
public class CategoryController {
    @Resource
    private CategoryServiceImpl categoryService;

    @ResponseBody
    @RequestMapping(value = "/getCategory")
    public List<Category> getLanguages(){
        return categoryService.getCategory();
    }
    @ResponseBody
    @RequestMapping(value = "/getCategoryById")
    public String getLanguagesById(@RequestBody Integer id){
        return categoryService.getCategoryById(id);
    }
}
