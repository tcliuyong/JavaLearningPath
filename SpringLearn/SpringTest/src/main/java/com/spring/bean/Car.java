package com.spring.bean;

/**
 * Created by liuyong on 16-1-1.
 */
public class Car {
    private String carName;

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int carAge) {
        this.price = carAge;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carAge=" + price +
                '}';
    }

}
