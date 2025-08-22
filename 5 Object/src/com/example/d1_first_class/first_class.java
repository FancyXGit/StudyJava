package com.example.d1_first_class;

public class first_class {
    public static void main(String[] args){
        Phone p1 = new Phone();
        p1.brand = "Apple";
        p1.price = 5999.99;
        p1.GetBrand();
        System.out.println();
        p1.GetPrice();
    }
}
