package org.fai.example;

public class Person extends Animal {
    private String name;
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " eat used .....");
    }

    @Override
    public void sleep() {
    }

    @Override
    public void run() {
        System.out.println(name + " run by 2 foots");
    }
}
