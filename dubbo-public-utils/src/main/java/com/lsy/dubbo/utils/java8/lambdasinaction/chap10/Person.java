package com.lsy.dubbo.utils.java8.lambdasinaction.chap10;

import java.util.Optional;

public class Person {

    private Optional<Car> car;

    public Optional<Car> getCar() {
        return car;
    }
}