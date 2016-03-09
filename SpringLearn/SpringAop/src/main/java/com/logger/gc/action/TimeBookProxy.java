package com.logger.gc.action;

import com.logger.gc.impl.TimeBookInterface;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by liuyong on 2016/3/9.
 */
public class TimeBookProxy {
    private Logger logger = Logger.getLogger(TimeBookProxy.class.getName());
    private TimeBookInterface timeBookInterface;
    public TimeBookProxy(TimeBookInterface timeBookInterface){
        this.timeBookInterface = timeBookInterface;
    }
    //实际的业务处理
    public void doAuditing(String name){
        logger.log(Level.INFO, name + "开始审核");
        timeBookInterface.doAuditing(name);
        logger.log(Level.INFO, name + "审核完成");


    }
}
