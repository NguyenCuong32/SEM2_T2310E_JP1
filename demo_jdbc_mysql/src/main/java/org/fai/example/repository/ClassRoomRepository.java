package org.fai.example.repository;

import org.fai.example.ConnectJDBC;
import org.fai.example.entity.ClassRoom;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.List;

public class ClassRoomRepository implements IClassRoomRepository {
    @Override
    public List<ClassRoom> getAllClassRooms() {
        return List.of();
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
                 statement.setString("class_name",classRoom.getClass_name());
                 statement.setInt("number_member",classRoom.getNumber_member());
                 statement.execute();
                 statement.close();
                 System.out.println("Inserted classroom");
             }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
