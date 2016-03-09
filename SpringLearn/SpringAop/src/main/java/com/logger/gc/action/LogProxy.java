package com.logger.gc.action;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by liuyong on 2016/3/9.
 */
public class LogProxy implements InvocationHandler {
    private Logger logger = Logger.getLogger(TimeBookProxy.class.getName());
    private Object delegate;
    public Object bind(Object delegate){
        this.delegate = delegate;
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(), delegate.getClass().getInterfaces(), this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        Object result = null;
        try{
            logger.log(Level.INFO, args[0] +"开始审核");
            result = method.invoke(delegate, args);
            logger.log(Level.INFO, args[0] +"审核完成");
        }catch (Exception e){
            logger.log(Level.INFO, e.toString());
        }
        return  result;
    }
}
