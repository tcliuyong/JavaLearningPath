package com.mapdic.share.service;

import com.mapdic.share.model.Knowledge;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by tcliuyong on 2016/3/20.
 */
public interface KnowledgeService {
    boolean addKnowledge(Knowledge knowledge);
    boolean updateKnowledge(Knowledge knowledge);
    List<Knowledge> getKnowledgeByUser(Integer id);
    List<Knowledge> getTop5Knowledge(Integer id);
    int countKnowledge(Integer id);
}
