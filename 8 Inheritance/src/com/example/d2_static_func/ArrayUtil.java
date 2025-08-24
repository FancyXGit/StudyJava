package com.example.d2_static_func;

import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil(){}

    public static String printIntArr(int[] arr){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i : arr){
            sj.add(String.valueOf(i));
        }
        return sj.toString();
    }

    public static double getAverage(double[] arr){
        double sum = 0;
        for (double i : arr){
            sum += i;
        }
        return sum / arr.length;
    }

}
