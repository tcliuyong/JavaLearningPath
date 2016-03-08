package com.apress.springrecipes.interest;

/**
 * Created by liuyong on 16-1-10.
 */
public interface InterestCalculator {
    public void setRate(double rate);
    public double calculate(double amount, double year);
    public void setRateCalculator(RateCalculator rateCalculator);
}
