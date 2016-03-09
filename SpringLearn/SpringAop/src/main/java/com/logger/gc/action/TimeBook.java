package com.logger.gc.action;

import com.logger.gc.impl.TimeBookInterface;

/**
 * Created by liuyong on 2016/3/9.
 */
public class TimeBook implements TimeBookInterface {
    public void doAuditing(String name) {
        System.out.println("doAuditing");
    }
}
