package org.fai.example;

import org.fai.example.dependencyinjection.repository.StudentRepository;
import org.fai.example.dependencyinjection.service.StudentService;
import org.fai.example.singletonexample.SingletonExample;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Demo Singleton");
        var singleton1 = SingletonExample.getInstance();
        var singleton2 = SingletonExample.getInstance();
        var singleton3 = SingletonExample.getInstance();
        System.out.println("Demo Dependency Injection");
        StudentService studentService = new StudentService(new StudentRepository());
        studentService.save();
    }
}