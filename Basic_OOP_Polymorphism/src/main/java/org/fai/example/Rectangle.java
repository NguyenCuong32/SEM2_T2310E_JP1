package org.fai.example;


public class Rectangle extends Shape {
    double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double height;
    @Override
    public double Area() {
        return width * height;
    }
}
