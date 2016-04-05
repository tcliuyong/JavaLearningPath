package com.mapdic.share.dao;

import com.mapdic.share.model.Language;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.INTERNAL;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuyong on 2016/3/16.
 */
@Repository
public interface LanguageDao {
    List<Language> getLanguages();
    String getLanguagesById(@Param("id")Integer id);
}
