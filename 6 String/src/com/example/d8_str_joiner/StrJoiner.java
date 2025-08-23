package com.example.d8_str_joiner;

import java.util.StringJoiner;

public class StrJoiner {
    public static void main(String[] args){
        StringJoiner sj = new StringJoiner(",","[","]");
        int[] arr = {1,2,43,23,5};
        for (int j : arr) {
            sj.add(String.valueOf(j));
        }
        System.out.println(sj);
    }
}
