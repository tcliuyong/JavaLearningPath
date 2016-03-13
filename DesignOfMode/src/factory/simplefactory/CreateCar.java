package factory.simplefactory;

import factory.obj.Car;
import factory.obj.LowCar;
import factory.obj.MidCar;
import factory.obj.TopCar;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class CreateCar {
    public static final String TOP = "top";
    public static final String Mid = "mid";
    public static final String LOW = "low";

    public static Car create(String mark) {
        Car car = null;
        if (mark.equals(TOP)) {
            car = new TopCar();
        } else if (mark.equals(LOW)) {
            car = new LowCar();
        } else {
            car = new MidCar();
        }
        return car;
    }
}
