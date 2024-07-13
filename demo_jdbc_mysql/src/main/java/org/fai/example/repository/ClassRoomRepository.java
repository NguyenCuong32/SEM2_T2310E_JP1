package org.fai.example.repository;

import org.fai.example.ConnectJDBC;
import org.fai.example.entity.ClassRoom;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ClassRoomRepository implements IClassRoomRepository {
    @Override
    public List<ClassRoom> getAllClassRooms() {
        List<ClassRoom> classRooms = new ArrayList<>();
        try {
            var conn = ConnectJDBC.getInstance().getConnection();
           if (conn != null&&!conn.isClosed()) {
               var stmt = conn.prepareCall("{call SELECT_CLASSROOM()}");
               var resultSet = stmt.executeQuery();
               while (resultSet.next()) {
                   ClassRoom classRoom = new ClassRoom();
//                   classRoom.setId_class(resultSet.getInt("id_class"));
                   classRoom.setClass_name(resultSet.getString("class_name"));
                   classRoom.setNumber_member(resultSet.getInt("number_member"));
                   classRooms.add(classRoom);
               }
           }
            return classRooms;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classRooms;
    }

    @Override
    public void saveClassRoom(ClassRoom classRoom) {
        try {
            // 1. Kết nối với DB
            var conn = ConnectJDBC.getInstance().getConnection();
            if (conn != null && !conn.isClosed()) {
                System.out.println("Connected to database");
                // 2. Insert vào DB
                CallableStatement statement = conn.prepareCall("{ call INSERT_CLASSROOM(?, ?) }");
                statement.setString("class_name", classRoom.getClass_name());
                statement.setInt("number_member", classRoom.getNumber_member());
                statement.execute();
                statement.close();
                System.out.println("Inserted classroom");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
