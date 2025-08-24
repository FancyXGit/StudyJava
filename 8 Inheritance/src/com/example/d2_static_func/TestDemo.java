package com.example.d2_static_func;

public class TestDemo {
    public static void main(String[] args){
        int[] arr1 = {342,25,2534,6,32,35};
        double[] arr2 = {235.45,235.434,76.25,362.252};
        System.out.println(ArrayUtil.printIntArr(arr1));
        System.out.println(ArrayUtil.getAverage(arr2));
    }
}