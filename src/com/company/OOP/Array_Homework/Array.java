package com.company.OOP.Array_Homework;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by User on 23.09.2015.
 */
public class Array {

    private int array[] =  new int[10];

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

     {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.print(" " + array[i]);
        }
    }


    public int maximum (){
        int result = 0;
        for(int i = 0; i < array.length; i++)
        {
            if (result < array[i]) {
                result = array[i];
            }
        }
        System.out.println("\nMaximum in array is: " + result);
        return result;
    }
    public int minimum (){
        int result = array[0];

        for(int i = 0; i < array.length; i++)
        {
            if (result > array[i]) {
                result = array[i];
            }
        }
        System.out.println("\nMinimum in array is: " + result);
        return result;
    }

    public void sortArray(){
        Arrays.sort(array);
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.print(" }");
        }

}



