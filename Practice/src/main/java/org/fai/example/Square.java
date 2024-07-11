package org.fai.example;

public class Square implements IGeometry {
   private double side;

   public Square(double side) {
       this.side = side;
   }
    @Override
    public double Area() {
        return Math.pow(side, 2);
    }

    @Override
    public double Perimeter() {
        return 4*side;
    }
}
