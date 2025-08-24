package com.example.d1_first_pmp;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.printf("老师姓名：%s,年龄：%d",getName(),getAge());
    }
}
