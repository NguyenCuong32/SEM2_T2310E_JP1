package org.fai.example.demojavafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.fai.example.demojavafx.entity.Student;
import org.fai.example.demojavafx.repository.StudentRepository;

public class StudentController {
    @FXML
    private Label lblTitle;
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtIdClass;
    @FXML
    public void initialize(){

    }
    public void insertStudent(Student student){
        StudentRepository studentRepository = new StudentRepository();;
        studentRepository.save(student);
    }
    public void onAddStudent(){
        Student student = new Student(txtFirstName.getText(),txtLastName.getText(),txtEmail.getText(),Integer.parseInt(txtIdClass.getText()));
        insertStudent(student);
    }
}
