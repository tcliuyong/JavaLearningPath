import com.apress.springrecipes.interest.InterestCalculator
import com.apress.springrecipes.interest.RateCalculator

class SimpleInterestCalculator implements InterestCalculator{
    //double rate 第一种的配置的时候这么写
    RateCalculator rateCalculator

    @Override
    void setRate(double rate) {

    }

    @Override
    double calculate(double amount, double year) {
        //println("test")
        return amount * year * rateCalculator.getAnnualRate() * 100
    }

}