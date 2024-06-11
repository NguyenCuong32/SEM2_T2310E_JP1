package org.fai.example;

import java.text.DateFormat;
import java.util.Date;

public class Manufacture implements IManufacture{
    private String manufactureName;
    @Override
    public void addContact() {
        this.manufactureName = "Manufacture";
        System.out.println("Adding contact");
    }

    @Override
    public void makePayment() {
        System.out.println("Making payment");
    }
}
