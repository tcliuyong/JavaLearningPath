package com.mapdic.share.common;


import org.apache.log4j.Logger;

import java.lang.Runtime;
/**
 * Created by liuyong on 2016/5/17.
 */
public class ExecuteExCommand {
    static Logger logger = Logger.getLogger(ExecuteExCommand.class);
    public static void exeShell(String command){
        try {
            Runtime runTime = Runtime.getRuntime();
            runTime.exec(command);
        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }
}
