package org.fai.example.repository;

import org.fai.example.entity.ClassRoom;

import java.util.List;

public interface IClassRoomRepository {
    List<ClassRoom> getAllClassRooms();
    void saveClassRoom(ClassRoom classRoom);
}
