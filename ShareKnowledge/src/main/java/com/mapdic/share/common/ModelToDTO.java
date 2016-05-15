package com.mapdic.share.common;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.mapdic.share.controller.dto.BookMarkDTO;
import com.mapdic.share.controller.dto.KnowledgeDTO;
import com.mapdic.share.controller.dto.KnowledgeSearchDTO;
import com.mapdic.share.controller.dto.UserDTO;
import com.mapdic.share.model.BookMark;
import com.mapdic.share.model.Knowledge;
import com.mapdic.share.model.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by tcliuyong on 2016/3/31.
 */
public class ModelToDTO {
    private static final String[] CATEGORY = new String[]{"基础知识","数据相关","基础组件","数学理论","算法相关","网络相关","云计算","异常信息","其他"};
    private static final String[] LANGUAGE = new String[]{"C/C++","JAVA","PYTHON","RUBY","PERL","LUA","其他"};
    public static KnowledgeDTO conKnowledgeToKnowledgeDTO(Knowledge knowledge){
        KnowledgeDTO knowledgeDTO = new KnowledgeDTO();
        knowledgeDTO.setK_id(knowledge.getK_id());
        knowledgeDTO.setTag(knowledge.getTag());
        knowledgeDTO.setSystem(knowledge.getSystem());
        //knowledgeDTO.setContent(knowledge.getContent());
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
    public static LinkedList<KnowledgeSearchDTO> conKnowledgeToKnowledgeSearchDTO(List<Knowledge> knowledges){
        LinkedList<KnowledgeSearchDTO> knowledgeSearchDTOs = new LinkedList<>();

        for(Knowledge knowledge : knowledges){
            KnowledgeSearchDTO knowledgeSearchDTO = new KnowledgeSearchDTO();
            knowledgeSearchDTO.setCategory(CATEGORY[knowledge.getCategory() - 1]);
            knowledgeSearchDTO.setLanguage(LANGUAGE[knowledge.getLanguage() - 1]);
            knowledgeSearchDTO.setOrcontent(knowledge.getOrcontent());
            knowledgeSearchDTO.setSystem(knowledge.getSystem());
            knowledgeSearchDTO.setK_id(knowledge.getK_id());
            knowledgeSearchDTO.setTag(knowledge.getTag());
            knowledgeSearchDTO.setTitle(knowledge.getTitle());

            knowledgeSearchDTOs.add(knowledgeSearchDTO);
        }
        return knowledgeSearchDTOs;
    }
}
