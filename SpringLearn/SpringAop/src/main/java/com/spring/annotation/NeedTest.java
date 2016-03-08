package com.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liuyong on 16-1-3.
 */
@Retention(RetentionPolicy.RUNTIME)//声明注解的保留期限
@Target(ElementType.METHOD)//声明可以使用该类
public @interface NeedTest {
    boolean value() default true;//声明注解成员
}
