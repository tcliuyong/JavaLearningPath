package com.calculator.calculatorly;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by liuyong on 16-1-10.
 */
@Aspect
public class CalculatorLoggingAspect {
    private Log log = LogFactory.getLog(this.getClass());
    @Before("execution(* com.calculator.cinterface.ArithmeticCalculator.add(..))")
    public void logBefore(){
        System.out.println("hehe");
        log.info("The method add() before");
    }
}
