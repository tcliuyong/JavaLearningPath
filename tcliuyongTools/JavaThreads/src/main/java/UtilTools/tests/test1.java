package UtilTools.tests;

import UtilTools.services.Calculator;

/**
 * Created by liuyong on 16-1-24.
 */
public class test1 {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            Calculator calculator = new Calculator(i);
            Thread thread = new Thread(calculator);
            thread.start();
        }
    }
}
