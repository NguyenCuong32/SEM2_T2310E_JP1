package org.fai.example;

public class Square  extends Shape {
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    double side;
    @Override
    public double Area() {
        return Math.pow(side,2);
    }
}
