package com.example.d7_strbuilder;

public class StrBuilder {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder("CDE");
        sb1.append("ABC");
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);

        int len = sb1.length();
        System.out.println(len);

        String str = sb1.toString();
        System.out.println(str);
    }
}
