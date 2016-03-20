package com.mapdic.share.serviceimpl;

import com.mapdic.share.dao.KnowledgeDao;
import com.mapdic.share.dao.UserDao;
import com.mapdic.share.model.Knowledge;
import com.mapdic.share.model.User;
import com.mapdic.share.service.KnowledgeService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tcliuyong on 2016/3/20.
 */
public class KnowledgeServiceImpl implements KnowledgeService {
    @Resource
    KnowledgeDao knowledgeDao;
    @Resource
    UserDao userDao;
    @Override
    public void addKnowledge(Knowledge knowledge) {
        knowledgeDao.addKnowledge(knowledge);
    }

    @Override
    public void updateKnowledge(Knowledge knowledge) {
        knowledgeDao.updateKnowledge(knowledge);
    }

    @Override
    public List<Knowledge> getKnowledgeByUser(Integer id) {
        User user = new User();
        user = userDao.getUserById(id);
        if(user != null)
            return knowledgeDao.getKnowledgeByUser(id);
        return null;
    }
}
