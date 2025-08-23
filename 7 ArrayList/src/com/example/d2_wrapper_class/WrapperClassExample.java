package com.example.d2_wrapper_class;

import java.util.ArrayList;

public class WrapperClassExample {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(3);
        list1.add(8);
        list1.add(6);
        System.out.println(list1);
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('c');
        list2.add('k');
        list2.add('x');
        System.out.println(list2);
    }
}
