package org.fai.example;

public class Animal {
  private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println( name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void run(){
        System.out.println(name + " is running");
    }
}
