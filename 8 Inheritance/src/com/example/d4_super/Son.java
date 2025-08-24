package com.example.d4_super;

public class Son extends Father{
    String name = "Son";
    public void sonShow(){
        String name = "Func";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
