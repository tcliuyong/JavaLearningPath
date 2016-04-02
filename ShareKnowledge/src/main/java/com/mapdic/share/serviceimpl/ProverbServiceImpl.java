package com.mapdic.share.serviceimpl;

import com.mapdic.share.dao.ProverbDao;
import com.mapdic.share.model.Proverbs;
import com.mapdic.share.service.ProverbService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liuyong on 2016/4/1.
 */
@Service
public class ProverbServiceImpl implements ProverbService {
    @Resource
    ProverbDao proverbDao;
    @Override
    public String getProverb() {
        return proverbDao.getProverb();
    }

    @Override
    public int addProverb(Proverbs proverbs) {
        return proverbDao.addProverb(proverbs);
    }
}
