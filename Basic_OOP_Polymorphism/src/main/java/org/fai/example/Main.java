package org.fai.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        double areaCircle = Math.round(circle.Area());
        System.out.println("Area of Circle: " + areaCircle);

        Square square = new Square();
        square.setSide(4);
        double areaSquare = square.Area();
        System.out.println("Area of Square: " + areaSquare);



    }
}