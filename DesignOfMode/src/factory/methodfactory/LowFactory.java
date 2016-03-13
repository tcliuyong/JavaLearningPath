package factory.methodfactory;

import factory.obj.Car;
import factory.obj.LowCar;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class LowFactory extends AbstractFactory {
    @Override
    public Car crete() {
        return new LowCar();
    }
}
