package com.mapdic.share.common;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by liuyong on 2016/5/17.
 */
@Component
public class Tasks {

    @Scheduled(cron="0 30 22  * * ? ")   //每5秒执行一次
    public void myTest(){
        String shellPath =  Tasks.class.getResource("/").getPath()+"backup.sh";
        ExecuteExCommand.exeShell("sh " +shellPath);
    }
}
