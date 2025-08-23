package com.example.d2_str_cons;

public class str_cons {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = s1;
        System.out.println(s1);
        System.out.println(s2);
        s2 += "efg";
        System.out.println(s1);
        System.out.println(s2);
    }
}
