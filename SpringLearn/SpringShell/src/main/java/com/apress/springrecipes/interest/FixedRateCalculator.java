package com.apress.springrecipes.interest;

/**
 * Created by liuyong on 16-1-10.
 */
public class FixedRateCalculator implements RateCalculator {
    public double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getAnnualRate() {
        return rate;
    }

    public double getMonthRate() {
        return rate / 12;
    }

    public double getDailyRate() {
        return rate / 365;
    }
}
