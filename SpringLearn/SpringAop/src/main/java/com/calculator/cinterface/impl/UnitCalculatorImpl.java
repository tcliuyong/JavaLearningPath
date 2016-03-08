package com.calculator.cinterface.impl;

import com.calculator.cinterface.UnitCalculator;
import org.springframework.stereotype.Component;

/**
 * Created by liuyong on 16-1-10.
 */
public class UnitCalculatorImpl implements UnitCalculator {


    public double kilogramToPround(double kilogram) {
        double pround = kilogram * 2.2;
        System.out.println("kilogramToPround");
        return pround;
    }


    public double kilometerToMile(double kilometer) {
        double mile = kilometer * 0.62;
        System.out.println("kilometerToMile");
        return mile;
    }
}
