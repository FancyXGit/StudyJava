package com.example.d1_array_list_basis;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("AAA");
        list.add("CCC");
        list.add("AAA");
        list.add("BBB");
        System.out.println(list);

        list.remove("AAA");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(1,"eee");
        System.out.println(list);

        System.out.println(list.get(1));
    }
}
