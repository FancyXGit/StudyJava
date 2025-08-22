package com.example.d3_switch;
import java.util.Scanner;

public class switch_example {
    public static void main(String[] args) {
        System.out.println("输入数字");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
            default:
                System.out.println("no");
                break;
        }
    }
}
