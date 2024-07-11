package org.fai.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nam",25);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        person = new Person("Quang",19);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        Person person2;
        person2 = new Person("Nam",25);

        person2 = new Person("Quang",19);
        double conner = Math.cos(Math.PI/2);
        double sin = Math.sin(Math.toRadians(180));
        System.out.println(conner);
        System.out.println(sin);
        System.out.println(Math.exp(1));
    }
}