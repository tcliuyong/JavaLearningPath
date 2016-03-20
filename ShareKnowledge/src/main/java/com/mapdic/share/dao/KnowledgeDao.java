package com.mapdic.share.dao;

import com.mapdic.share.model.Knowledge;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuyong on 2016/3/20.
 */
@Repository
public interface KnowledgeDao {
    void addKnowledge(Knowledge knowledge);
    void updateKnowledge(Knowledge knowledge);
    List<Knowledge> getKnowledgeByUser(@Param("userId") Integer id);
}
