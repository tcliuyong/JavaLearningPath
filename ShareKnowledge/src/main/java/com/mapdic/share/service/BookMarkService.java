package com.mapdic.share.service;

import com.mapdic.share.dao.BookMarkDao;
import com.mapdic.share.model.BookMark;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liuyong on 2016/4/6.
 */
public interface BookMarkService {
    BookMark getBookMarkById(Integer id, Integer uid);
    boolean addBookMark(BookMark bookMark);
    boolean delBookMarkById(Integer id, Integer uid);
    boolean updateBookMark(BookMark bookMark);
    List<BookMark> getBookMarkByPage( Integer id, Integer start,Integer end);
    int countBookMark(Integer id);
}
