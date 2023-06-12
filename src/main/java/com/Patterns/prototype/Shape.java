package com.Patterns.prototype;

import java.util.Objects;

public abstract class Shape {
    public int coordinateX;
    public int coordinateY;
    public String color;

    public Shape() {

    }

    public Shape(Shape dot) {
        if (dot != null) {
            this.coordinateX = dot.coordinateX;
            this.coordinateY = dot.coordinateY;
            this.color = dot.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return coordinateX == shape.coordinateX && coordinateY == shape.coordinateY && Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY, color);
    }
}
