package com.mapdic.share.controller;

import com.mapdic.share.common.EnumCode;
import com.mapdic.share.common.ModelToDTO;
import com.mapdic.share.common.UserEnum;
import com.mapdic.share.controller.dto.*;
import com.mapdic.share.model.BookMark;
import com.mapdic.share.model.Knowledge;
import com.mapdic.share.model.Token;
import com.mapdic.share.model.User;
import com.mapdic.share.serviceimpl.BookMarkServiceImpl;
import com.mapdic.share.serviceimpl.TokenServiceImpl;
import com.mapdic.share.serviceimpl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by liuyong on 2016/4/6.
 */
@Controller
public class BookMarkController {
    @Resource
    BookMarkServiceImpl bookMarkService;
    @Resource
    TokenServiceImpl tokenServiceImpl;
    @Resource
    UserServiceImpl userService;

    static final String face = "../face/default.jpg" ;
    static final String prefix = "../face/" ;
    @ResponseBody
    @RequestMapping(value ="/getBookMarkByPage")
    public List<BookMarkDTO> getBookMarkByPage(@RequestBody PageDTO pageDTO){
        List<BookMark> bookMarks = bookMarkService.getBookMarkByPage(pageDTO.getUid(),
                pageDTO.getPage(), pageDTO.getPagesize());

        List<BookMarkDTO> bookMarkDTOs =new ArrayList<>();
        for(BookMark bookMark : bookMarks){
            bookMarkDTOs.add(ModelToDTO.conBookMarkToBookMarkDTO(bookMark));
        }
        return bookMarkDTOs;
    }

    @ResponseBody
    @RequestMapping(value ="/getBookMarkById")
    public BookMarkDTO getBookMarkById(@RequestBody CookieKid cookieKid){
        BookMarkDTO bookMarkDTO = new BookMarkDTO();
        int uid = tokenServiceImpl.getTokenByKeepAlive(cookieKid.getToken()).getUid();
        User user = userService.getUserById(uid);
        BookMark bookMark = bookMarkService.getBookMarkById(cookieKid.getKid(), uid);
        bookMarkDTO.setId(bookMark.getId());
        bookMarkDTO.setUser(bookMark.getUser());
        bookMarkDTO.setBookmark(bookMark.getBookmark());
        if(user.getFace() == null || user.getFace().equals("")){
            bookMarkDTO.setFace(face);
        }else {
            bookMarkDTO.setFace(user.getFace());
        }
        bookMarkDTO.setDescription(bookMark.getDescription());

        return bookMarkDTO;
    }

    @ResponseBody
    @RequestMapping(value ="/delBookMarkById")
    public String delBookMarkById(@RequestBody DelKnoDTO delKnoDTO){
        Token ctoken = tokenServiceImpl.getTokenByKeepAlive(delKnoDTO.getCookie());
        Date date = new Date();
        if(ctoken != null && ctoken.getTime().after(date)){
            if (bookMarkService.delBookMarkById(ctoken.getUid(), delKnoDTO.getK_id()))
                return UserEnum.OK.getName();
        }
        return UserEnum.FAIL.getName();
    }

    @ResponseBody
    @RequestMapping(value ="/countBookMark")
    public int countBookMark(@RequestBody String id){
        id = id.replace("=","");
        int page = bookMarkService.countBookMark(Integer.parseInt(id));
        return page % 5==0 ? page/5:page/5 + 1;
    }

    @ResponseBody
    @RequestMapping(value ="/addBookMark")
    public String addBookMark(@RequestBody BookMark bookMark){
        if(bookMark != null){
            bookMark.setDate(new Date());
            bookMarkService.addBookMark(bookMark);
            return EnumCode.OK.getName();
        }
        return EnumCode.FAIL.getName();
    }

    @ResponseBody
    @RequestMapping(value ="/updateBookMark")
    public String updateBookMark(@RequestBody BookMark bookMark){
        if(bookMark != null){
            bookMark.setDate(new Date());
            bookMarkService.updateBookMark(bookMark);
            return EnumCode.OK.getName();
        }
        return EnumCode.FAIL.getName();
    }
}
