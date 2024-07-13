package org.fai.example.dependencyinjection.service;

import org.fai.example.dependencyinjection.repository.IStudentRepository;
import org.fai.example.dependencyinjection.repository.StudentRepository;

public class StudentService implements IStudentService {
    private final IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void save() {
        this.studentRepository.save();
    }

    @Override
    public void delete() {
        this.studentRepository.delete();
    }
}
