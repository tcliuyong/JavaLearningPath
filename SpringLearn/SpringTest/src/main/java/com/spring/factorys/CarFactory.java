package com.spring.factorys;

import com.spring.bean.Car;

/**
 * Created by liuyong on 16-1-1.
 */
//Car 的工厂方法
//工厂的注入方法 见配置文件CarFactoryBean
public class CarFactory{
    //Car的非静态工厂方法
    public Car createBMCar(){
        Car car = new Car();
        car.setCarName("baoma");
        return car;
    }
    public static Car createStaticBMCar(){
        Car car = new Car();
        car.setCarName("baoma");
        return car;
    }
}
