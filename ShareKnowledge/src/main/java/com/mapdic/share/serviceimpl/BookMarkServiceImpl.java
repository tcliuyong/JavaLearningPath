package com.mapdic.share.serviceimpl;


import com.mapdic.share.dao.BookMarkDao;
import com.mapdic.share.model.BookMark;
import com.mapdic.share.service.BookMarkService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liuyong on 2016/4/6.
 */
@Service
public class BookMarkServiceImpl implements BookMarkService {
    @Resource
    BookMarkDao bookMarkDao;
    @Override
    public BookMark getBookMarkById(Integer id, Integer uid) {
        return bookMarkDao.getBookMarkById(id, uid);
    }

    @Override
    public boolean addBookMark(BookMark bookMark) {
        if(bookMarkDao.addBookMark(bookMark) >= 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean delBookMarkById(Integer id, Integer uid) {
        if(bookMarkDao.delBookMarkById(id, uid) >= 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateBookMark(BookMark bookMark) {
        if(bookMarkDao.updateBookMark(bookMark) >= 1){
            return true;
        }
        return false;
    }

    @Override
    public List<BookMark> getBookMarkByPage(Integer id, Integer start, Integer end) {
        if(start == 1){
            start = start - 1;
        }else {
            start = (start - 1) * end;
        }
        return bookMarkDao.getBookMarkByPage(id, start, end);
    }

    @Override
    public int countBookMark(Integer id) {
        return bookMarkDao.countBookMark(id);
    }
}
