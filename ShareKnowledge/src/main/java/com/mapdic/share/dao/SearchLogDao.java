package com.mapdic.share.dao;

import com.mapdic.share.model.SearchLog;
import org.springframework.stereotype.Repository;

/**
 * Created by liuyong on 2016/5/22.
 */
@Repository
public interface SearchLogDao {
    int addSearchLog(SearchLog searchLog);
}
