package org.fai.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int salary = 2003;
//        switch (salary){
//            case 2000:
//                System.out.println("Salary is 2000");
//                break;
//            case 2001:
//                System.out.println("Salary is 2001");
//                    break;
//            default:
//                System.out.println("Salary is default");
//                break;
//        }

        enum DayInWeek {Mon, Tue, Wed, Thu, Fri, Sat, Sun}
        DayInWeek dayInWeek = DayInWeek.Thu;
        switch (dayInWeek) {
            case Mon:
                System.out.println("Day is Mon");
                break;
            case Tue:
                System.out.println("Day is Tue");
                break;
            case Wed:
            case Thu:
            case Fri:
            case Sat:
            case Sun:
                System.out.println("Day in week is " + dayInWeek);
                break;
        }
    }
}