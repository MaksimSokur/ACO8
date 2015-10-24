package com.company.OOP.Week4.Recursion;

/**
 * Created by User on 11.10.2015.
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(recMethod(5));
    }
    public static int recMethod(int val){
        if(val == 0)return 1;
        return val*recMethod(val-1);
    }


}
