package com.company.OOP.Array_Homework;

import java.util.Random;

/**
 * Created by User on 23.09.2015.
 */
public class Array {
    private int [] array;

    public int maximum (int array[]){
        int result = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(" " + array[i]);
        }
        for(int i = 0; i < array.length; i++)
        {
            if (result < array[i]) {
                result = array[i];
            }
        }
        System.out.println("\nMaximum in array is: " + result);
        return result;
    }
    public int minimum (int array[]){
        int result = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(" " + array[i]);
        }
        for(int i = 0; i < array.length; i++)
        {
            if (result > array[i]) {
                result = array[i];
            }
        }
        System.out.println("\nMinimum in array is: " + result);
        return result;
    }


}
