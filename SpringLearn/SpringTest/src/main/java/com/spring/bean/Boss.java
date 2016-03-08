package com.spring.bean;

/**
 * Created by liuyong on 16-1-1.
 */
public class Boss {

    private String name;
    private int age;
    private Car car;

    public Boss() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Boss(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }
}
