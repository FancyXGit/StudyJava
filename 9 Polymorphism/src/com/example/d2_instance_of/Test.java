package com.example.d2_instance_of;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.doSomething();
//        Dog a2 = (Dog) a1;
//        a2.saySth();

//        if (a1 instanceof Dog){
//            System.out.println("a1为DOG类型");
//        }
        if (a1 instanceof Dog d){
            d.saySth();
        }

    }
}
