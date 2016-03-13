package factory.methodfactory;

import factory.obj.Car;
import factory.obj.TopCar;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class TopFactory extends AbstractFactory {
    @Override
    public Car crete() {
        return new TopCar();
    }
}
