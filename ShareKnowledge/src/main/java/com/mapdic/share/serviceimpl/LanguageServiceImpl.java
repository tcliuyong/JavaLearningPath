package com.mapdic.share.serviceimpl;

import com.mapdic.share.dao.LanguageDao;
import com.mapdic.share.model.Language;
import com.mapdic.share.service.LanguageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liuyong on 2016/3/16.
 */
@Service
public class LanguageServiceImpl implements LanguageService {
    @Resource
    LanguageDao languageDao;
    @Override
    public List<Language> getLanguages() {
        return languageDao.getLanguages();
    }
}
