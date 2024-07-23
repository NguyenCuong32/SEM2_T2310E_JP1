package org.fai.example.demojavafx.repository;

import org.fai.example.demojavafx.entity.Student;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    @Override
    public void save(Student student) {
        try {
            var conn = ConnectJDBC.getInstance().getConnection();
            CallableStatement callStmt = conn.prepareCall("{call INSERT_STUDENT(?,?,?,?)}");
            callStmt.setString("email", student.getEmail());
            callStmt.setString("first_name", student.getFirst_name());
            callStmt.setInt("id_class", student.getId_class());
            callStmt.setString("last_name", student.getLast_name());
            callStmt.executeUpdate();
            callStmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Student> findAll() {
        try{
            var conn = ConnectJDBC.getInstance().getConnection();
            List<Student> students = new ArrayList<>();
            CallableStatement callStmt = conn.prepareCall("{call SP_GET_ALL_STUDENTS()}");
            ResultSet rs = callStmt.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setFirst_name(rs.getString("first_name"));
                student.setLast_name(rs.getString("last_name"));
                students.add(student);
            }
            return students;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Integer studentId) {
        try {
            var conn = ConnectJDBC.getInstance().getConnection();
            CallableStatement callStmt = conn.prepareCall("{call DELETE_STUDENT(?)}");
            callStmt.setInt("studentId", studentId);
            callStmt.execute();
            callStmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student findById(Integer studentId) {
        try {

            var conn = ConnectJDBC.getInstance().getConnection();
            CallableStatement callStmt = conn.prepareCall("{call SELECT_STUDENT_BYID(?)}");
            callStmt.setInt("studentId", studentId);
            var resultSet = callStmt.executeQuery();
            if (resultSet.next()) {
                String first_name = resultSet.getString("first_name");
                String email = resultSet.getString("email");
                String last_name = resultSet.getString("last_name");
                Integer id = resultSet.getInt("id_class");
                Student student = new Student(first_name, email, last_name, id);
                return student;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Student student) {
        try{
            var conn = ConnectJDBC.getInstance().getConnection();
            CallableStatement callStmt = conn.prepareCall("{call UPDATE_STUDENT(?,?,?,?,?)}");
            callStmt.setString("first_name", student.getFirst_name());
            callStmt.setString("last_name", student.getLast_name());
            callStmt.setInt("id_class", student.getId_class());
            callStmt.setString("email", student.getEmail());
            callStmt.setInt("student_id", student.getId());
            callStmt.executeUpdate();
            callStmt.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
