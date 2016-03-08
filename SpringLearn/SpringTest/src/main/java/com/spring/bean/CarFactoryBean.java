package com.spring.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by liuyong on 16-1-1.
 */
//看看这种注入方式 CarFactoryBean.xml
public class CarFactoryBean implements FactoryBean<Car> {

    private String carinfo;
    public String getCarinfo() {
        return carinfo;
    }

    public void setCarinfo(String carinfo) {
        this.carinfo = carinfo;
    }
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carinfo.split(",");
        car.setCarName(infos[0]);
        car.setPrice(Integer.parseInt(infos[1]));
        return car;
    }

    public Class<Car> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
