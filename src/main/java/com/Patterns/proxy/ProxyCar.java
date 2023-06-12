package com.Patterns.proxy;

public class ProxyCar implements Car {
    Car bmw = new Bmw();

    @Override
    public void drive() {
        System.out.println("Proxy code!");
        bmw.drive();
    }
}
