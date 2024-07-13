package org.fai.example.dependencyinjection.repository;

public class StudentRepository implements IStudentRepository{
    @Override
    public void save() {
        System.out.println("Student Repository save");
    }

    @Override
    public void delete() {
        System.out.println("Student Repository delete");
    }
}
