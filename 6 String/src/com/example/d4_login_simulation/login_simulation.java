package com.example.d4_login_simulation;
import java.util.Scanner;

public class login_simulation {
    public static void main(String[] args){
        user_info u1 = new user_info("Alice","123456");
        int try_time = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("name:");
            String try_name = sc.next();
            System.out.println("Password");
            String try_password = sc.next();
            try_time++;
            if (try_name.equals(u1.getName()) && try_password.equals(u1.getPassword())){
                System.out.println("success");
                break;
            }else {
                System.out.println("Wrong");
            }
            if (try_time >= 3){
                System.out.println("Access Denied");
                break;
            }
        }while (true);
    }
}
