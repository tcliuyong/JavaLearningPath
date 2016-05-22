package com.mapdic.share.service;

import com.mapdic.share.model.SearchLog;
import org.springframework.stereotype.Service;

/**
 * Created by liuyong on 2016/5/22.
 */
public interface SearchLogService {
    boolean addSearchLog(SearchLog searchLog);
}
