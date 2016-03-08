package com.spring.aopimp;

import com.spring.annotation.NeedTest;

/**
 * Created by liuyong on 16-1-3.
 */
public class NeedTestMain {
    @NeedTest(value=true)
    public void deleteSth(){
        System.out.println("true");
    }
}
