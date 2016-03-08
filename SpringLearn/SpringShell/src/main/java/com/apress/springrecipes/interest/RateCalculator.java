package com.apress.springrecipes.interest;

/**
 * Created by liuyong on 16-1-10.
 */
public interface RateCalculator {
    public double getAnnualRate();
    public double getMonthRate();
    public double getDailyRate();
}
