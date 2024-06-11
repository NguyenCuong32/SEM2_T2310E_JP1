package org.fai.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nam",20,"Male","Ha noi");
        person.setAge(-1);
        System.out.println(person.toString());
    }
}