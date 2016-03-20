package com.mapdic.share.service;

import com.mapdic.share.model.Knowledge;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by tcliuyong on 2016/3/20.
 */
public interface KnowledgeService {
    void addKnowledge(Knowledge knowledge);
    void updateKnowledge(Knowledge knowledge);
    List<Knowledge> getKnowledgeByUser(Integer id);
}
