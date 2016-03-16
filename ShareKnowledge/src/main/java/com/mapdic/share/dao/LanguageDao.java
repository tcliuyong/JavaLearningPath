package com.mapdic.share.dao;

import com.mapdic.share.model.Language;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuyong on 2016/3/16.
 */
@Repository
public interface LanguageDao {
    List<Language> getLanguages();
}
