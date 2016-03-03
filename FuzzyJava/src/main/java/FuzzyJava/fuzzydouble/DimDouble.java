package FuzzyJava.fuzzydouble;

import java.math.BigDecimal;

/**
 * Created by liuyong on 2016/3/3.
 */
public class DimDouble {
    public static void main(String[] args) {
        System.out.println(2.00 - 1.10);
        //0.8999999999999999
        BigDecimal a1 = new BigDecimal("2.00");
        BigDecimal a2 = new BigDecimal("1.10");
        System.out.println(a1.subtract(a2));
    }
}
