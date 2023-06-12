package com.Patterns.proxy;

public class Main {
    public static void main(String[] args) {
        Car car = new ProxyCar();
        car.drive();
    }
}
