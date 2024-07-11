package org.fai.example.demo_javafx;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import org.fai.example.demo_javafx.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtAge;
    @FXML
    private TextField txtAddress;
    @FXML
    private Label lblInformation;
    List<Student> students;
    @FXML
    public void initialize() {
        students = new ArrayList<>();
    }
    @FXML
    protected void onAddStudent() {
        String name = txtName.getText();
        Integer age = Integer.valueOf(txtAge.getText());
        String address = txtAddress.getText();
        lblInformation.setText(name + " " + age + " " + address);
        students.add(new Student(name,age,address));
        onDisplayStudent();
    }
    @FXML
    protected void onDisplayStudent() {
        GridPane grdStudent = new GridPane();
        grdStudent.setHgap(10);
        grdStudent.setVgap(10);
        grdStudent.setPadding(new Insets(10,10,10,10));
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            grdStudent.add(new Label(student.getName()), 0, i);
            grdStudent.add(new Label(String.valueOf(student.getAge())), 1, i);
            grdStudent.add(new Label(student.getAddress()), 2, i);
        }
        grdStudent.getChildren().add(grdStudent);

    }
    @FXML
    protected void onNewClicked() {
        System.out.println("New Clicked");
    }
}