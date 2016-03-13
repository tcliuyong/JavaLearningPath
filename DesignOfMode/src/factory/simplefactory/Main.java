package factory.simplefactory;

import factory.obj.Car;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Main {
    public static void main(String[] args) {
        Car car = CreateCar.create("top");
        System.out.println(car.SaySelf());

    }
}
