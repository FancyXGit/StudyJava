package com.example.d3_private;

public class Person {
    private int age;

    public void setAge(int age){
        if (age >= 0 && age <= 120){
            this.age = age;
        }else {
            System.out.println("Error Age");
        }
    }

    public int getAge(){
        return this.age;
    }
}