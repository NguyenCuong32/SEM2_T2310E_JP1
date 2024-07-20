package org.fai.example.demojavafx.repository;

import org.fai.example.demojavafx.entity.Student;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    @Override
    public void save(Student student) {
        try {
            var conn = ConnectJDBC.getInstance().getConnection();
            CallableStatement callStmt = conn.prepareCall("{call INSERT_STUDENT(?,?,?,?)}");
            callStmt.setString("email",student.getEmail());
            callStmt.setString("first_name",student.getFirst_name());
            callStmt.setInt("id_class",student.getId_class());
            callStmt.setString("last_name",student.getLast_name());
            callStmt.executeUpdate();
            callStmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }
}
