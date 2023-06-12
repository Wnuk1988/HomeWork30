package com.Patterns.prototype;

public class Circle extends Shape {
    public int radius;

    public Circle() {

    }

    public Circle(Circle dot) {
        super(dot);
        if (dot != null) {
            this.radius = dot.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
