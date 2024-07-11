package org.fai.example;

public class Bicycle implements IVehicle,IBicycle{
    @Override
    public void cycle() {
        System.out.println("Bicycle cycle");
    }

    @Override
    public void start() {
        System.out.println("Bicycle start");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stop");
    }
}
