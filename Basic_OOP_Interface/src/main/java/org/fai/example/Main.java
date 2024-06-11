package org.fai.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manufacture manufacture = new Manufacture();
        manufacture.addContact();
        manufacture.makePayment();

        IManufacture manufacture2 = new Manufacture();
        manufacture2.addContact();
        manufacture2.makePayment();
        Car car = new Car();
        car.addContact();
        car.makePayment();
        car.MakeProduct();
        car.ShowPrice();
        show();
        Bike.getName();
    }
    private static void show() {
        System.out.println("Manufacture");
    }
}