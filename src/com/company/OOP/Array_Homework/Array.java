package com.company.OOP.Array_Homework;

/**
 * Created by User on 23.09.2015.
 */
public class Array {
    private int [] array;

    public int maximum (int array[]){
        int result = 0;

        for(int i = 0; i < array.length; i++)
        {
            if (result < array[i]) {
                result = array[i];
            }
        }return result;
    }

}
