package com.spring.aopimp;

import com.spring.aopservice.Waiter;

/**
 * Created by liuyong on 16-1-3.
 */
public class NavieWaiter implements Waiter {
    public void greetTo(String clientName) {
        System.out.println("hello "+ clientName);
    }

    public void serveTo(String clientName) {
        System.out.println("lan dian sha ");

    }
}
