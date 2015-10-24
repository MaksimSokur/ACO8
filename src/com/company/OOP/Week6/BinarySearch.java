package com.company.OOP.Week6;

/**
 * Created by User on 24.10.2015.
 */
public class BinarySearch {
    public static int binarySearch(int[] mas, int key){
       int start = 0;
        int end = mas.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(key < mas[mid]){
                end = mid;
            }else if(key > mas[mid]){
                start = mid;
            }else return key;
        }
       return -1;
    }

    public static void main(String[] args) {

       int[] myMas = new int[]{5, 6, 9, 7, 8, 5, 23, 16};

        int k = 5;
        System.out.println(binarySearch(myMas,k));
    }
}
