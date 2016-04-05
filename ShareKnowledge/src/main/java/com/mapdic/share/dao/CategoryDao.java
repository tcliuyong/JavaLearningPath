package com.mapdic.share.dao;

import com.mapdic.share.model.Category;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.javassist.bytecode.annotation.IntegerMemberValue;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuyong on 2016/4/5.
 */
@Repository
public interface CategoryDao {
    List<Category> getCategory();
    String getCategoryById(@Param("id") Integer id);
}
