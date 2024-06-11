package org.fai.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Parrot parrot = new Parrot();
        parrot.setName("Parrot");
        parrot.setColor("Blue");

        Shark shark = new Shark();
        shark.setName("Shark");
        shark.setColor("White");

        animals.add(parrot);
        animals.add(shark);
        printAnimals(animals);
    }
    private static void printAnimals(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " " + animal.getColor());
        }
    }
}