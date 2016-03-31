package com.mapdic.share.serviceimpl;

import com.mapdic.share.dao.KnowledgeDao;
import com.mapdic.share.dao.UserDao;
import com.mapdic.share.model.Knowledge;
import com.mapdic.share.model.User;
import com.mapdic.share.service.KnowledgeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tcliuyong on 2016/3/20.
 */
@Service
public class KnowledgeServiceImpl implements KnowledgeService {
    @Resource
    KnowledgeDao knowledgeDao;
    @Resource
    UserDao userDao;
    @Override
    public boolean addKnowledge(Knowledge knowledge) {
        if(knowledgeDao.addKnowledge(knowledge) == 1)
            return true;
        return false;
    }

    @Override
    public boolean updateKnowledge(Knowledge knowledge) {
        if(knowledgeDao.updateKnowledge(knowledge) == 1)
            return true;
        return false;
    }

    @Override
    public List<Knowledge> getKnowledgeByUser(Integer id) {
        User user = new User();
        user = userDao.getUserById(id);
        if(user != null)
            return knowledgeDao.getKnowledgeByUser(id);
        return null;
    }

    @Override
    public List<Knowledge> getTop5Knowledge(Integer id) {
        return knowledgeDao.getTop5Knowledge(id);
    }

    @Override
    public int countKnowledge(Integer id) {
        return knowledgeDao.countKnowledge(id);
    }
}
