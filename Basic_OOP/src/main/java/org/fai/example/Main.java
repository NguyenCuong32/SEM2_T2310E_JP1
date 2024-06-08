package org.fai.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Custommer customerObject  = new Custommer("Id001","Anh","Ha noi",3);
        customerObject.customerId="ID1000";
        if (customerObject != null) {
            System.out.println(customerObject.toString());
            customerObject.order();
        }
        else {
            System.out.println("Customer object is null");
        }
        Custommer customerObject2 = new Custommer("Huy","ID1001","Ha noi",30);
        System.out.println(customerObject2.toString());
        customerObject2.order();
    }
}