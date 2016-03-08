package com.calculator.cinterface;

import org.springframework.stereotype.Component;

/**
 * Created by liuyong on 16-1-10.
 */

public interface ArithmeticCalculator {
    public double add(double a, double b);
    public double sub(double am, double b);
    public double mul(double a, double b);
    public double div(double a, double b);
}
