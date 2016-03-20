package com.mapdic.share.dao;

import com.mapdic.share.model.Knowledge;
import org.springframework.stereotype.Repository;

/**
 * Created by liuyong on 2016/3/20.
 */
@Repository
public interface KnowledgeDao {
    void addKnowledge(Knowledge knowledge);
    void updateKnowledge(Knowledge knowledge);
}
