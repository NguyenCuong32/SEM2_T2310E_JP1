package org.fai.example;

public class Manufacture implements IManufacture{
    @Override
    public void addContact() {
        System.out.println("Adding contact");
    }

    @Override
    public void makePayment() {
        System.out.println("Making payment");
    }
}
