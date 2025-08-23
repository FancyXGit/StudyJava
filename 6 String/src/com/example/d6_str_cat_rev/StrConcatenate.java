package com.example.d6_str_cat_rev;

public class StrConcatenate {
    public static void main(String[] args){
        int[] arr = {1,2,34,2,425};
        System.out.println(IntArr2Str(arr));
    }

    public static StringBuilder IntArr2Str(int[] arr){
        if (arr == null){
            return new StringBuilder("[]");
        }
        StringBuilder str_int_arr = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++){
            String c = String.valueOf(arr[i]);
            str_int_arr.append(c);
            if (i != arr.length - 1){
                str_int_arr.append(",");
            }
        }
        str_int_arr.append("]");
        return str_int_arr;
    }
}
