package factory.abstractfactory;

import factory.obj.IBus;
import factory.obj.Car;
import factory.obj.TopCar;
import factory.obj.UpIBus;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class TopFactory extends AbstractFactory {
    @Override
    public Car createCar() {
        return new TopCar();
    }

    @Override
    public IBus createBus() {
        return new UpIBus();
    }
}
