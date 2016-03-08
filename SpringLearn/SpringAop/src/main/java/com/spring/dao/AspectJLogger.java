package com.spring.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * Created by liuyong on 16-1-3.
 */
@Aspect
public class AspectJLogger {
    /**
     * 必须为final String类型的,注解里要使用的变量只能是静态常量类型的
     */
    public static final String EDP = "execution(* com.spring.bean.CommonEmployee.sign*(..))";

    @Before(EDP)    //spring中Before通知
    public void logBefore() {
        System.out.println("logBefore:现在时间是:"+new Date());
    }

    @After(EDP)    //spring中After通知
    public void logAfter() {
        System.out.println("logAfter:现在时间是:"+new Date());
    }

    @Around(EDP)   //spring中Around通知
    public Object logAround(ProceedingJoinPoint joinPoint) {
        System.out.println("logAround开始:现在时间是:"+new Date()); //方法执行前的代理处理
        Object[] args = joinPoint.getArgs();
        Object obj = null;
        try {
            obj = joinPoint.proceed(args);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("logAround结束:现在时间是:"+new Date());  //方法执行后的代理处理
        return obj;
    }
}
