package org.fai.example;

public interface IProduct {
    public void MakeProduct();
    private void CalculatePrice(){
        System.out.println("Calculate Price .....");
    }
    default void ShowPrice(){
        CalculatePrice();
    }
}
