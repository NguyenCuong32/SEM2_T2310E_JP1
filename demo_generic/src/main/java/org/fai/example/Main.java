package org.fai.example;

import org.fai.example.generic2.GenericRepository;
import org.fai.example.generic2.Student;
import org.fai.example.generic2.Teacher;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumberGeneric example = new NumberGeneric<Integer>();
        example.enterNumber(1);
        example.enterNumber(2);
        example.enterNumber(3);
        example.enterNumber(4);
        example.enterNumber(5);

        example.print();

        example = new NumberGeneric<Double>();
        example.enterNumber(1.0);
        example.enterNumber(2.0);
        example.enterNumber(3.0);
        example.enterNumber(4.0);
        example.enterNumber(5.0);
        example.print();

        example = new NumberGeneric<String>();
        example.enterNumber("1");
        example.enterNumber("2");
        example.enterNumber("3");
        example.enterNumber("4");
        example.enterNumber("5");
        example.print();

        System.out.println("Exampe object");

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Hung"));
        teachers.add(new Teacher("Nam"));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Hoa",20));
        students.add(new Student("Nam",30));

        GenericRepository<Student> studentGenericRepository = new GenericRepository<>();
        studentGenericRepository.setItems(students);
        studentGenericRepository.print();

        GenericRepository<Teacher> teacherGenericRepository = new GenericRepository<>();
        teacherGenericRepository.setItems(teachers);
        teacherGenericRepository.print();

    }
}