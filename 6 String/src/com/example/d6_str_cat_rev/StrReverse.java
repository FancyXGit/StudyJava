package com.example.d6_str_cat_rev;

public class StrReverse {
    public static void main(String[] args){
        String str1 = "ABCD";
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        System.out.println(str2);
    }
}
