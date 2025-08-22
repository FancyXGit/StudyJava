package com.example.d5_javabean;

public class User {
    private String name;
    private String password;
    private String email;
    private int gender;
    private int age;

    public User(){

    }

    public User(String name,String password,String email,int gender,int age){
        setName(name);
        setPassword(password);
        setEmail(email);
        setGender(gender);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(int gender){
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

}
