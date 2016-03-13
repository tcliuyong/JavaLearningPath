package factory.abstractfactory;

import factory.obj.IBus;
import factory.obj.Car;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public abstract class AbstractFactory {
    public abstract Car createCar();
    public abstract IBus createBus();
}
