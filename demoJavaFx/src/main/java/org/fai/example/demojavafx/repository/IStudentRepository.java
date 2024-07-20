package org.fai.example.demojavafx.repository;

import org.fai.example.demojavafx.entity.Student;

import java.util.List;

public interface IStudentRepository {
    void save(Student student);
    List<Student> findAll();
    void delete(Integer studentId);
    Student findById(Integer studentId);
    void update(Student student);
}
