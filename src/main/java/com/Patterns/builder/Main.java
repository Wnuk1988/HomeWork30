package com.Patterns.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.BuilderCar()
                .setBrand("BMW")
                .setBodyView("Sedan")
                .setEngineType("Diesel")
                .setNumberOfWheels(4)
                .setFullSet(true)
                .builder();
        System.out.println(car);
    }
}
