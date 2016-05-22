package com.mapdic.share.serviceimpl;

import com.mapdic.share.dao.SearchLogDao;
import com.mapdic.share.model.SearchLog;
import com.mapdic.share.service.SearchLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liuyong on 2016/5/22.
 */
@Service
public class SearchLogServiceImpl implements SearchLogService {
    @Resource
    SearchLogDao searchLogDao;
    @Override
    public boolean addSearchLog(SearchLog searchLog) {
        if(searchLogDao.addSearchLog(searchLog) > 0){
            return true;
        }
        return false;
    }
}
