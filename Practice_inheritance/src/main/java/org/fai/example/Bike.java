package org.fai.example;

public class Bike implements IVehicle,IBike {
    @Override
    public void runByEngine() {
        System.out.println("Bike is running... by engine");
    }

    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}
