package org.fai.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//       System.out.println("Hello World!");
//       int summary=0;
//       summary = Summary(5,7);
//       System.out.println(summary);
//
//       int x =0, y = 0, z =0;
//       int a=10;
//       int b=20;
//       String name ="T2310E";
//
//       System.out.println(a);
//       System.out.println(b);
//       System.out.println(x);
//
//       System.out.println(name);
//
//       int age =0;
//       String fullname ="Nguyen Van A";
//       String address ="Ha noi";
//       Double salary =1000.0;
//
//       System.out.println("Full Name: "+fullname);


//       enum Direction {
//           EAST, NORTH, SOUTH,WEST
//       }
//
//        System.out.println("Direction: "+Direction.NORTH);
//        System.out.println("Direction: "+  (Direction.WEST.ordinal()));
//        System.out.println("Please enter a number:");
//        Scanner scanner = new Scanner(System.in);
//        int age;
//        age = scanner.nextInt();
//        double salary;
//        salary = scanner.nextDouble();
//        System.out.println("Age "+ age);
//
//        String fullname = scanner.next();
//
//        System.out.println("Fullname "+ fullname);

        boolean checkNumber;
        int x =4;
        if (x>10)
        {
           checkNumber = true;
        }
        else {
            checkNumber = false;
        }
        System.out.println("Check number "+checkNumber);
        checkNumber = (x>10)? true:false;
        System.out.println("Check number "+checkNumber);
    }
    private static int Summary(int a, int b) {
        return a + b;
    }
}