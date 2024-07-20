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
    private Label lblMessage;
    @FXML
    private TextField txtStudentId;
    @FXML
    public void initialize(){

    }
    public void insertStudent(Student student){
        try {
            StudentRepository studentRepository = new StudentRepository();
            studentRepository.save(student);
            lblMessage.setText("Student inserted successfully");
        }
        catch (Exception e){
            lblMessage.setText(e.getMessage());
        }
    }
    public void onAddStudent(){
        Student student = new Student(txtFirstName.getText(),txtLastName.getText(),txtEmail.getText(),Integer.parseInt(txtIdClass.getText()));
        insertStudent(student);
    }
    public void onDeleteStudent(){
        try{
            StudentRepository studentRepository = new StudentRepository();
            studentRepository.delete(Integer.parseInt(txtStudentId.getText()));
        }catch (Exception e){
            lblMessage.setText(e.getMessage());
        }
    }

    public void onGetStudent(){
        StudentRepository studentRepository = new StudentRepository();
        Student student = studentRepository.findById(Integer.parseInt(txtStudentId.getText()));
        txtFirstName.setText(student.getFirst_name());
        txtLastName.setText(student.getLast_name());
        txtEmail.setText(student.getEmail());
        txtIdClass.setText(student.getId_class().toString());
    }
    public void onUpdateStudent(){
        try {
            StudentRepository studentRepository = new StudentRepository();
            String firstName = txtFirstName.getText();
            String lastName = txtLastName.getText();
            String email = txtEmail.getText();
            String idClass = txtIdClass.getText();
            Integer studentId = Integer.parseInt(txtStudentId.getText());

            Student student = new Student(firstName,lastName,email,Integer.parseInt(idClass));
            student.setId(studentId);
            studentRepository.update(student);
            lblMessage.setText("Student updated successfully");
        } catch (Exception e){
            lblMessage.setText(e.getMessage());
        }
    }
}
