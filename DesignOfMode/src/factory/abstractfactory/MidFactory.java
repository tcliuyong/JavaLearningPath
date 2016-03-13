package factory.abstractfactory;

import factory.obj.*;
import factory.obj.IBus;
import factory.obj.MidIBus;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class MidFactory extends AbstractFactory {
    @Override
    public Car createCar() {
        return new MidCar();
    }

    @Override
    public IBus createBus() {
        return new MidIBus();
    }
}
