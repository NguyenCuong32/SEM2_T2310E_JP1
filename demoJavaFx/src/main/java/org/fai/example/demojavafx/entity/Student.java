package org.fai.example.demojavafx.entity;

public class Student {
    private Integer id;
    private String first_name;
    private String last_name;
    private String email;
    private Integer id_class;

    public Student(String first_name, String last_name, String email, Integer id_class) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.id_class = id_class;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId_class() {
        return id_class;
    }

    public void setId_class(Integer id_class) {
        this.id_class = id_class;
    }
}
