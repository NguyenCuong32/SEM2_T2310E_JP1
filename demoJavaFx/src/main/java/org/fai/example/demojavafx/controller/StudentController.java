package org.fai.example.demojavafx.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.fai.example.demojavafx.entity.Student;
import org.fai.example.demojavafx.repository.StudentRepository;

import java.util.List;

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
    private TableView tableView;

    @FXML
    public void initialize() {
//        initStudent();
    }

    public void insertStudent(Student student) {
        try {
            StudentRepository studentRepository = new StudentRepository();
            studentRepository.save(student);
            lblMessage.setText("Student inserted successfully");
        } catch (Exception e) {
            lblMessage.setText(e.getMessage());
        }
    }

    public void onAddStudent() {
        Student student = new Student(txtFirstName.getText(), txtLastName.getText(), txtEmail.getText(), Integer.parseInt(txtIdClass.getText()));
        insertStudent(student);
    }

    public void onDeleteStudent() {
        try {
            StudentRepository studentRepository = new StudentRepository();
            studentRepository.delete(Integer.parseInt(txtStudentId.getText()));
        } catch (Exception e) {
            lblMessage.setText(e.getMessage());
        }
    }

    public void onGetStudent() {
        StudentRepository studentRepository = new StudentRepository();
        Student student = studentRepository.findById(Integer.parseInt(txtStudentId.getText()));
        txtFirstName.setText(student.getFirst_name());
        txtLastName.setText(student.getLast_name());
        txtEmail.setText(student.getEmail());
        txtIdClass.setText(student.getId_class().toString());
    }

    public void onUpdateStudent() {
        try {
            StudentRepository studentRepository = new StudentRepository();
            String firstName = txtFirstName.getText();
            String lastName = txtLastName.getText();
            String email = txtEmail.getText();
            String idClass = txtIdClass.getText();
            Integer studentId = Integer.parseInt(txtStudentId.getText());

            Student student = new Student(firstName, lastName, email, Integer.parseInt(idClass));
            student.setId(studentId);
            studentRepository.update(student);
            lblMessage.setText("Student updated successfully");
        } catch (Exception e) {
            lblMessage.setText(e.getMessage());
        }
    }
    public void onShowAllData(){
        initStudent();
    }
    public void initStudent() {
        StudentRepository studentRepository = new StudentRepository();
        List<Student> students = studentRepository.findAll();
        TableColumn<Student, Integer> id = new TableColumn<>("Id");
        id.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Student, String> first_name = new TableColumn<>("First_name");
        first_name.setCellValueFactory(new PropertyValueFactory<>("first_name"));

        TableColumn<Student, String> last_name = new TableColumn<>("Last_name");
        last_name.setCellValueFactory(new PropertyValueFactory<>("last_name"));

        ObservableList<Student> dataStudents = FXCollections.observableArrayList(students);

//        tableView.setItems(dataStudents);

        tableView.getColumns().addAll(id, first_name, last_name);

        tableView.setItems(dataStudents);
    }
}
