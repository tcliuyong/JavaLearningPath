package com.calculator.cinterface.impl;

import com.calculator.cinterface.ArithmeticCalculator;
import org.springframework.stereotype.Component;

/**
 * Created by liuyong on 16-1-10.
 */
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

    public double add(double a, double b) {
        System.out.println("a add b ");
        return a + b;
    }


    public double sub(double am, double b) {
        System.out.println("a sub b ");
        return am -b;
    }


    public double mul(double a, double b) {
        System.out.println("a mul b ");
        return a * b;
    }


    public double div(double a, double b) {
        System.out.println("a div b ");
        return a / b;
    }
}
