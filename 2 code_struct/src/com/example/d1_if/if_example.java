package com.example.d1_if;
import java.util.Scanner;

public class if_example {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age pls.");
        int age = sc.nextInt();
        if (age > 30){
            System.out.printf("%d?You are so old",age);
        }else{
            System.out.printf("%d!You are so young!",age);
        }
    }
}
