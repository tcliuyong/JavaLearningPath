package com.mapdic.share.dao;

import com.mapdic.share.model.BookMark;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.javassist.bytecode.annotation.IntegerMemberValue;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuyong on 2016/4/6.
 */
@Repository
public interface BookMarkDao {
    BookMark getBookMarkById(@Param("bid")Integer id, @Param("uid")Integer uid);
    int addBookMark(BookMark BookMark);
    int delBookMarkById(@Param("bid")Integer id, @Param("uid")Integer uid);
    int updateBookMark(BookMark BookMark);
    List<BookMark> getBookMarkByPage(@Param("uid") Integer id, @Param("start") Integer start, @Param("end") Integer end);
    int countBookMark(@Param("userId") Integer id);
}
