package com.Patterns.builder;

public class Car {
    private String brand;
    private String bodyView;
    private String engineType;
    private int numberOfWheels;
    private boolean fullSet;

    public static class BuilderCar{
        private Car car;
        public BuilderCar(){
            this.car = new Car();
        }
        public BuilderCar setBrand(String brand){
            car.setBrand(brand);
            return this;
        }
        public BuilderCar setBodyView(String type){
            car.setBodyView(type);
            return this;
        }
        public BuilderCar setEngineType(String engine){
            car.setEngineType(engine);
            return this;
        }
        public BuilderCar setNumberOfWheels(int count){
            car.setNumberOfWheels(count);
            return this;
        }
        public BuilderCar setFullSet(boolean equipment){
            car.setFullSet(equipment);
            return this;
        }
        public Car builder(){
            return car;
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBodyView() {
        return bodyView;
    }

    public void setBodyView(String bodyView) {
        this.bodyView = bodyView;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isFullSet() {
        return fullSet;
    }

    public void setFullSet(boolean fullSet) {
        this.fullSet = fullSet;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", bodyView='" + bodyView + '\'' +
                ", engineType='" + engineType + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", fullSet=" + fullSet +
                '}';
    }
}
