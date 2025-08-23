package com.example.d3_class_list;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args){
        ArrayList<Student> sl = new ArrayList<>();
        sl.add(new Student("Alice",20));
        sl.add(new Student("Bob",18));
        sl.add(new Student("Census",19));
        for (Student s:sl){
            System.out.printf("name:%s;age:%d\n",s.name,s.Age);
        }
    }
}
