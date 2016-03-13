package factory.abstractfactory;

import factory.obj.IBus;
import factory.obj.Car;
import factory.obj.DnIBus;
import factory.obj.LowCar;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class LowFactory extends AbstractFactory {
    @Override
    public Car createCar() {
        return new LowCar();
    }

    @Override
    public IBus createBus() {
        return new DnIBus();
    }
}
