package com.example.d5_random;
import java.util.Random;

public class random_example {
    public static void main(String[] args){
        Random r = new Random();
        while (true){
            int ra = r.nextInt(0,99);
            if (ra == 10){
                System.out.println(ra);
                break;
            }else{
                System.out.println(ra);
            }
        }
    }
}
