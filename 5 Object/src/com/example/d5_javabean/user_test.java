package com.example.d5_javabean;

public class user_test {
    public static void main(String[] args){
        User u1 = new User("Alice","123456","123@xmail.com",1,21);
        System.out.println(u1.getName());
        System.out.println(u1.getPassword());
        System.out.println(u1.getEmail());
        System.out.println(u1.getGender());
        System.out.println(u1.getAge());
    }
}
