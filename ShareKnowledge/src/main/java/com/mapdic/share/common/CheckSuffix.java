package com.mapdic.share.common;

/**
 * Created by liuyong on 2016/4/7.
 */
public class CheckSuffix {
    static final String[] FILESUFFIX = new String[]{"tar","zip", "tar", "gz","gzip"};
    public static boolean checkFileSuffix(String filename){
        int sufIndex = filename.lastIndexOf(".");
        String suffix = filename.substring(sufIndex+1).toLowerCase();
        for(String str :FILESUFFIX){
            if(str.equals(suffix)){
                return true;
            }
        }
            return false;
    }
}
