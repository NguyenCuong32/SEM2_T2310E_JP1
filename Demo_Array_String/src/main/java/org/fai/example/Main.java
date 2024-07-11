package org.fai.example;

import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.TimerTask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int array [] = new  int[]{ 1,2,4,60};
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

//        Person[] arrayPerson = new Person[]{
//                new Person("Nam",20),
//                new Person("Anh",19),
//                new Person("Thu",30)
//        };
//        Person [] arrayPerson = new Person[3];
//        arrayPerson[0] = new Person("Nam",20);
//        arrayPerson[1] = new Person("Anh",19);
//        arrayPerson[2] = new Person("Thu",30);
//
//        for (int i = 0; i < arrayPerson.length; i++) {
//            System.out.println(arrayPerson[i].getName() + " " + arrayPerson[i].getAge());
//        }
//
//        int [][] twoDimision = new int[3][3];
//        twoDimision[0][0] = 1;
//        twoDimision[0][1] = 2;
//        twoDimision[0][2] = 3;
//        twoDimision[1][0] = 4;
//        twoDimision[1][1] = 5;
//        twoDimision[1][2] = 6;
//        twoDimision[2][0] = 7;
//        twoDimision[2][1] = 8;
//        twoDimision[2][2] = 9;
//        for (int i = 0; i < twoDimision.length; i++) {
//            for (int j = 0; j < twoDimision[i].length; j++) {
//                System.out.println(twoDimision[i][j] + " ");
//            }
//        }

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Nam",20));
        persons.add(new Person("Anh",19));
        persons.add(new Person("Thu",30));
        if (persons!=null && persons.size()>0){
            for (int i = 0; i < persons.size(); i++) {
                System.out.println(persons.get(i).getName() + " " + persons.get(i).getAge());
            }
        }

//

        String title ="Java Programing Language";
        String className ="T2310E";

        /*Cộng chuỗi*/
        String newString = title + " " + className +"    ";

        System.out.println(newString);

        String subString = newString.substring(3,newString.length());
        System.out.println(subString);

        System.out.println(newString.toLowerCase());

        System.out.println(newString.toUpperCase());

        String trimString = newString.trim();
        System.out.println(trimString);


        String stringReplace ="CSharp";

        newString = newString.replace("Java",stringReplace);
        System.out.println(newString);


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(newString);
        System.out.println(stringBuilder.toString());
        stringBuilder.append("Aptech");
        System.out.println(stringBuilder.toString());

//        demoException();
        demoTimer();
        System.out.println("End Process");

    }

    private static  void demoException(){
        try {
            int[] array = new int[]{1,2,3,4,5};
            System.out.println(array[8]);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
//            throw  new RuntimeException();
        }
        finally {
            System.out.println("Finally block");
        }
    }
    private static  void demoTimer(){
        System.out.println(Year.now());
        System.out.println(Month.AUGUST);
        var dt = new Date();
        System.out.println(dt.getTime());
        java.time.LocalDateTime localDateTime = java.time.LocalDateTime.now();

        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        ;
        System.out.println(localDateTime.plusDays(3));
        java.util.Timer timer = new java.util.Timer();


        enum DayInWeek {
            /**
             *
             */
            MON, TUE, WED, THU, FRI, SAT, SUN}
        DayInWeek dayInWeek = DayInWeek.MON;

        java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();

        var endcode = encoder.encode(new byte[]{0x04, 0x32, 0x03, 0x04, 0x05, 0x06, 0x35});

        System.out.println(endcode);
        Base64.Decoder decoder = Base64.getDecoder();
        decoder = Base64.getDecoder();


    }
}