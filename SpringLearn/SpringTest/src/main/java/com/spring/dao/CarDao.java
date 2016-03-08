package com.spring.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by liuyong on 16-1-1.
 */
@Scope("prototype")//默认是单例的
@Component
public class CarDao {
    public void sayHelloWorld(){
        System.out.println("HelloWorld");
    }
}
