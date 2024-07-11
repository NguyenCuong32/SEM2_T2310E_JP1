package org.fai.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area of square: " + square.Area());
        System.out.println("Perimeter of square: " + square.Perimeter());

        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.Area());
        System.out.println("Perimeter of circle: " + circle.Perimeter());
    }
}