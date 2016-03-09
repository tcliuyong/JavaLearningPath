package com.logger.gc.main;

import com.logger.gc.action.LogProxy;
import com.logger.gc.action.TimeBook;
import com.logger.gc.action.TimeBookProxy;
import com.logger.gc.impl.TimeBookInterface;

/**
 * Created by liuyong on 2016/3/9.
 */
public class Main {
    public static void main(String[] args) {
        //这里是针对接口编程
        TimeBookProxy timeBookProxy = new TimeBookProxy(new TimeBook());
        timeBookProxy.doAuditing("liuyong");
        //Proxy logger
        LogProxy logProxy = new LogProxy();
        TimeBookInterface timeBook = (TimeBookInterface) logProxy.bind(new TimeBook());
        timeBook.doAuditing("liuyong");
    }
}
