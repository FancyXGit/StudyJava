package com.example.d1_static_member;

public class Student {
    private String name;
    private int age;
    private String gender;
    //declare teacher_name as static
    //is owned by all objects
    public static String teacher_name;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study(){
        System.out.printf("%s正在学习\n",name);
    }

    public void showInfo(){
        System.out.printf("姓名：%s 年龄：%d 性别：%s 老师：%s\n",name,age,gender,teacher_name);
    }
}
