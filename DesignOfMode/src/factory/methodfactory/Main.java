package factory.methodfactory;

import factory.obj.Car;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new TopFactory();
        Car car = abstractFactory.crete();
        System.out.println(car.SaySelf());
    }
}
