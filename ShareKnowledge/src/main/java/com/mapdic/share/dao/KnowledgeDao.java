package com.mapdic.share.dao;

import com.mapdic.share.model.Knowledge;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.javassist.bytecode.annotation.IntegerMemberValue;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuyong on 2016/3/20.
 */
@Repository
public interface KnowledgeDao {
    int delKnowledge(@Param("uid") Integer uid, @Param("kid") Integer kid);
    int addKnowledge(Knowledge knowledge);
    int updateKnowledge(Knowledge knowledge);
    Knowledge getKnowledgeByKid(@Param("kid") Integer kid);
    Knowledge getKnowledgeByUidKid(@Param("kid") Integer kid, @Param("uid") Integer uid);
    List<Knowledge> getKnowledgeByUser(@Param("userId") Integer id);
    List<Knowledge> getTop5Knowledge(@Param("userId") Integer id);
    int countKnowledge(@Param("userId") Integer id);
    List<Knowledge> getKnowledgeByPage(@Param("uid") Integer id, @Param("start") Integer start, @Param("end") Integer end);
}
