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
    public int addKnowledge(Knowledge knowledge) {
        return knowledgeDao.addKnowledge(knowledge);

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

    @Override
    public List<Knowledge> getKnowledgeByPage(Integer id, Integer start, Integer end) {

        if(start == 1){
            start = start - 1;
        }else {
            start = (start - 1) * end;
        }
        return knowledgeDao.getKnowledgeByPage(id, start, end);
    }

    @Override
    public boolean delKnowledge(Integer uid, Integer kid) {
        if(knowledgeDao.delKnowledge(uid, kid) >0){
            return true;
        }
        return false;
    }

    @Override
    public Knowledge getKnowledgeByKid(Integer kid) {
        if(kid != null)
            return knowledgeDao.getKnowledgeByKid(kid);
        return null;
    }

    @Override
    public Knowledge getKnowledgeByUidKid(Integer kid, Integer uid) {
        return knowledgeDao.getKnowledgeByUidKid(kid, uid);
    }

    @Override
    public List<Knowledge> getKnowledgeByUserCategory(Integer cid, Integer start, Integer end) {
        if(start == 1){
            start = start - 1;
        }else {
            start = (start - 1) * end;
        }
        List<Knowledge> knowledges = knowledgeDao.getKnowledgeByUserCategory(cid, start, end);
        return knowledges;
    }

    @Override
    public int countKnowledgeByCid(Integer category) {
        return knowledgeDao.countKnowledgeByCid(category);
    }

    @Override
    public List<Knowledge> getKnowledgeByCategory(Integer cid) {

        return knowledgeDao.getKnowledgeByCategory(cid);
    }

}
