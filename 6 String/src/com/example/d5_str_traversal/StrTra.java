package com.example.d5_str_traversal;
import java.util.Scanner;

public class StrTra {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int upper_case_count = 0;
        int lower_case_count = 0;
        int num_count = 0;
        for (int i = 0; i < str1.length(); i++){
            char c = str1.charAt(i);
            if (Character.isUpperCase(c)){
                upper_case_count++;
            }else if (Character.isLowerCase(c)){
                lower_case_count++;
            }else if (Character.isDigit(c)){
                num_count++;
            }
        }
        System.out.println(upper_case_count);
        System.out.println(lower_case_count);
        System.out.println(num_count);
    }
}
