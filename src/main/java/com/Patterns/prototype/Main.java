package com.Patterns.prototype;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.coordinateX = 5;
        circle.coordinateY = 10;
        circle.radius = 7;
        circle.color = "Blue";
        Circle circleTwo = (Circle)circle.clone();
        if (circle.equals(circleTwo)){
            System.out.println("Прототип создан!");
        }else {
            System.out.println("Неудача создания копии.");
        }
    }
}
