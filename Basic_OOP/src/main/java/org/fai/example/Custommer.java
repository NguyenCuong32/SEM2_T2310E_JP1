package org.fai.example;

public class Custommer {
    public String customerId;
    private String customerName;
    private String customerAddress;
    private int customerAge;
    // Hàm tạo mặc định không có tham sô
//    public Custommer(){
//        System.out.println("Default Constructor");
//    }
//    public Custommer(String customerId, String customerName, String customerAddress, int customerAge) {
//        System.out.println("Constructor have parameters");
//    }


    public Custommer(String customerId) {
        this.customerId = customerId;
    }

    public Custommer(String customerName, String customerId, String customerAddress, int customerAge) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
        this.customerAge = customerAge;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public void order(){
        System.out.println("CustomerId "+customerId +" ordered some item.") ;
    }
    @Override
    public String toString() {
        return "Custommer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerAge=" + customerAge +
                '}';
    }
}
