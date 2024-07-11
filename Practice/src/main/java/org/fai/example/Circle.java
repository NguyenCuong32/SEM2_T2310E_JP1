package org.fai.example;

public class Circle extends Geometry {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double Area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double Perimeter() {
        return 2*Math.PI*radius;
    }
}
