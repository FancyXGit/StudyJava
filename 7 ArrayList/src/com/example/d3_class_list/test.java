package com.example.d3_class_list;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        int a = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            a = sc.nextInt();
            arr.add(a);
        }
        System.out.println(arr);
    }
}
