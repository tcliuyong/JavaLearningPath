package com.mapdic.share.common;

import java.io.File;
import java.util.Date;
/**
 * Created by liuyong on 2016/4/2.
 */
public class RenameUploadFile {
    public static String rename(String filename) {
        String body="";
        String ext="";
        Date date = new Date();
        int pot=filename.lastIndexOf(".");
        if(pot!=-1){
            body= date.getTime() +"";
            ext=filename.substring(pot);
        }else{
            body=(new Date()).getTime()+"";
            ext="";
        }
        String newName=body+ext;
        return newName;
    }
}
