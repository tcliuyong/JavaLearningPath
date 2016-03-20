package test;

import com.mapdic.share.dao.KnowledgeDao;
import com.mapdic.share.model.Knowledge;
import com.mapdic.share.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by liuyong on 2016/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class KnowLedgeTest {
    @Resource
    KnowledgeDao knowledgeDao;
    @Test
    public void addKnowLedge(){
        Knowledge knowledge = new Knowledge();
        User user = new User();
        user.setId(1);
        knowledge.setTag("java、C++");
        knowledge.setContent("<b>Test</b>");
        knowledge.setCategory("Java");
        knowledge.setUser(user);
        knowledge.setSystem("Windows7");
        knowledge.setIsCheck(1);
        knowledge.setIsForbidden(0);
        knowledge.setDate(new Date());
        knowledgeDao.addKnowledge(knowledge);
    }
    @Test
    public void updateKnowledge(){
        Knowledge knowledge = new Knowledge();
        User user = new User();
        user.setId(1);
        knowledge.setK_id(2);
        knowledge.setTag("C++");
        knowledge.setContent("<b>Test</b>");
        knowledge.setCategory("Java");
        knowledge.setUser(user);
        knowledge.setSystem("Windows8");
        knowledge.setIsCheck(1);
        knowledge.setIsForbidden(0);
        knowledge.setDate(new Date());
        knowledgeDao.updateKnowledge(knowledge);
    }
    @Test
    public void getKnowledgeByUser(){
        List<Knowledge> knowledges = knowledgeDao.getKnowledgeByUser(2);
        System.out.println();
        System.out.println(knowledges.get(0).getContent());

    }
}
