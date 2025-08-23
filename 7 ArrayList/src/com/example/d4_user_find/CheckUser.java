package com.example.d4_user_find;

import java.util.ArrayList;

public class CheckUser {
    public static void main(String[] args){
        ArrayList<User> user_list = new ArrayList<>();
        user_list.add(new User(223,"Alice","123456"));
        System.out.println(FindUserID(user_list,223));

    }

    public static int FindUserID(ArrayList<User> user_list,int id){
        int index = 0;
        for (User i : user_list){
            if (i.getId() == id){
                return index;
            }
            index++;
        }
        return -1;
    }
}
