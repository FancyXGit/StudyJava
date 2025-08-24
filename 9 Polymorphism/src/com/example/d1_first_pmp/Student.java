package com.example.d1_first_pmp;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void show(){
        System.out.printf("学生姓名:%s,年龄:%d",getName(),getAge());
    }
}
