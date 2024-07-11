package org.fai.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(100);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(200);
        list.add(300);


        Stream<Integer> stream = list.stream().sorted();
        System.out.println("Take while");
        Stream<Integer> stream2 = list.stream().takeWhile(num -> num < 5);
        stream2.forEach(System.out::println);

        System.out.println("Filter demo");
//        Stream<Integer> filter = list.stream().filter(x -> x % 2 != 0);
//        filter.forEach(System.out::println);
//        var filter2 = list.stream().findFirst().get();
//        System.out.println("First element: " + filter2);

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Nam",20));
        people.add(new Person("Hong",30));
        people.add(new Person("James",40));

        Stream<Person> peopleStream = people.stream();

        List<Person> newStream =  peopleStream.filter(p->p.getName1()=="Nam").toList();

        for (Person p : newStream) {
            System.out.println(p.getName1() + " " + p.getAge());
        }



//        var newPeople = peopleStream.sorted().toList();
//        newPeople.forEach(System.out::println);


    }
}