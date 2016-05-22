package com.mapdic.share.annotation;

import java.lang.annotation.*;

/**
 * Created by liuyong on 2016/5/22.
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public  @interface SystemServiceLog {
    String description()  default "";

}