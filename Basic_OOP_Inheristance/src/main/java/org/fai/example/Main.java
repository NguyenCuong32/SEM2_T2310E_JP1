package org.fai.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Nam");
        person.eat();
        person.sleep();
        person.run();

        Cat cat = new Cat();
        cat.setName("Meo");
        cat.eat();
        cat.sleep();
        cat.run();

        Dog dog = new Dog();
        dog.setName("Cho");
        dog.eat();
        dog.sleep();
        dog.run();
    }
}