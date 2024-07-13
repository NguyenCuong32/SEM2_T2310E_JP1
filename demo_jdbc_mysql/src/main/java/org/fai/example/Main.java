package org.fai.example;

import org.fai.example.entity.ClassRoom;
import org.fai.example.repository.ClassRoomRepository;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Demo connection mysql");
        ClassRoomRepository classRoomRepository = new ClassRoomRepository();
        ClassRoom classRoom = new ClassRoom();
        classRoom.setClass_name("T2306E");
        classRoom.setNumber_member(20);
        classRoomRepository.saveClassRoom(classRoom);
        System.out.println("Class rooms:");
        var students = classRoomRepository.getAllClassRooms();
        for (var student : students) {
            System.out.println(student.getClass_name() + " " + student.getNumber_member());
        }
    }
}