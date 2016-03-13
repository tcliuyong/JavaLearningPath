package factory.abstractfactory;

import factory.obj.Car;

import java.util.Calendar;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new MidFactory();
        Car car = abstractFactory.createCar();
        System.out.println(car.SaySelf());
    }
}
