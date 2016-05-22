package com.mapdic.share.common;

import com.mapdic.share.controller.Search;
import com.mapdic.share.model.SearchLog;
import com.mapdic.share.serviceimpl.SearchLogServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
/**
 * Created by liuyong on 2016/5/22.
 */
@Aspect
@Component
public class SearchLogInterceptor {
    //如果是@Arround需要ProceedingJoinPoint point
    @Resource
    SearchLogServiceImpl searchLogService;
    @Pointcut("@annotation(com.mapdic.share.annotation.SystemControllerLog)")
    public void myMethod(){

    }
    @Before("myMethod()")
    public void after(JoinPoint point){
        HttpServletRequest httpServletRequest = (HttpServletRequest)point.getArgs()[4];
        SearchLog searchLog = new SearchLog();
        Date dateTime = new Date();
        searchLog.setIp(httpServletRequest.getRemoteAddr());
        searchLog.setVisitKeyword((String) point.getArgs()[0]);
        searchLog.setVisitTime(dateTime);
        searchLogService.addSearchLog(searchLog);
    }
}
