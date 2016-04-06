package com.mapdic.share.common;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.mapdic.share.controller.dto.BookMarkDTO;
import com.mapdic.share.controller.dto.KnowledgeDTO;
import com.mapdic.share.controller.dto.UserDTO;
import com.mapdic.share.model.BookMark;
import com.mapdic.share.model.Knowledge;
import com.mapdic.share.model.User;

/**
 * Created by tcliuyong on 2016/3/31.
 */
public class ModelToDTO {
    public static KnowledgeDTO conKnowledgeToKnowledgeDTO(Knowledge knowledge){
        KnowledgeDTO knowledgeDTO = new KnowledgeDTO();
        knowledgeDTO.setK_id(knowledge.getK_id());
        knowledgeDTO.setTag(knowledge.getTag());
        knowledgeDTO.setSystem(knowledge.getSystem());
        knowledgeDTO.setContent(knowledge.getContent());
        knowledgeDTO.setTitle(knowledge.getTitle());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = simpleDateFormat.format(knowledge.getDate());
        knowledgeDTO.setDate(date);
        return knowledgeDTO;
    }
    public static BookMarkDTO conBookMarkToBookMarkDTO(BookMark bookMark){
        BookMarkDTO bookMarkDTO = new BookMarkDTO();
        bookMarkDTO.setId(bookMark.getId());
        bookMarkDTO.setDescription(bookMark.getDescription());
        bookMarkDTO.setBookmark(bookMark.getBookmark());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = simpleDateFormat.format(bookMark.getDate());
        bookMarkDTO.setDate(date);
        return bookMarkDTO;
    }
}
