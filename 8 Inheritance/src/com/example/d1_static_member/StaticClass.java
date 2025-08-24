package com.example.d1_static_member;

public class StaticClass {
    public static void main(String[] args){
        Student s1 = new Student("Bob",18,"男");
        Student.teacher_name = "yes";
        s1.study();
        s1.showInfo();

        Student s2 = new Student("Alice",19,"女");
        s2.showInfo();
        s2.study();
    }
}
