package org.fai.example;

import java.util.Hashtable;

public class HashTableExample {
    public void HashTableExample1(){
        Hashtable<String,String> hashTable = new Hashtable<>();
        hashTable.put("A","8-10");
        hashTable.put("B","6-8");
        hashTable.put("C","5-6");
        hashTable.put("F","0-4");
        hashTable.put("F","7-8");

        System.out.println(hashTable.get("A"));
        System.out.println(hashTable.get("F"));
//        System.out.println(hashTable.get(null));
        System.out.println(hashTable.size());
    }

    public void HashTableExample2(){
        Hashtable<Integer,Student> hashTable = new Hashtable<>();
        hashTable.put(1,new Student("Nguyen",20));
        hashTable.put(2,new Student("Le",30));
        hashTable.put(3,new Student("Tran",40));
        hashTable.put(4,new Student("Hoang",50));
        hashTable.put(5,new Student("Vu",60));

        System.out.println(hashTable.get(4).getName() +" " +hashTable.get(4).getAge());
    }
}
