package com.mapdic.share.common;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.mapdic.share.controller.dto.KnowledgeDTO;
import com.mapdic.share.controller.dto.UserDTO;
import com.mapdic.share.model.Knowledge;
import com.mapdic.share.model.User;

/**
 * Created by tcliuyong on 2016/3/31.
 */
public class ModelToDTO {
    public synchronized static KnowledgeDTO conKnowledgeToKnowledgeDTO(Knowledge knowledge){
        KnowledgeDTO knowledgeDTO = new KnowledgeDTO();
        knowledgeDTO.setK_id(knowledge.getK_id());
        knowledgeDTO.setTag(knowledge.getTag());
        knowledgeDTO.setSystem(knowledge.getSystem());
        knowledgeDTO.setContent(knowledge.getContent());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = simpleDateFormat.format(knowledge.getDate());
        knowledgeDTO.setDate(date);
        return knowledgeDTO;
    }

}
