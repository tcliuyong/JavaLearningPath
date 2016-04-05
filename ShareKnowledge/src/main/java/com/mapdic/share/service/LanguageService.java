package com.mapdic.share.service;

import com.mapdic.share.model.Language;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liuyong on 2016/3/16.
 */

public interface LanguageService {
    List<Language> getLanguages();
    String getLanguagesById(@Param("id")Integer id);
}
