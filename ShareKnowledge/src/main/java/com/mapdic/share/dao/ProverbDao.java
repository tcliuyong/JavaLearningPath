package com.mapdic.share.dao;

import com.mapdic.share.model.Proverbs;
import org.springframework.stereotype.Repository;

/**
 * Created by liuyong on 2016/4/1.
 */
@Repository
public interface ProverbDao {
    String getProverb();
    int addProverb(Proverbs proverbs);
}
