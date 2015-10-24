package com.company.OOP.Week5.DAY1;

/**
 * Created by User on 17.10.2015.
 */
public class ArrayQueue  {
      public static void main(String[] args) {
            int i = 10;
          System.out.println(fibonacci(i));
        }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n-2);
    }
}
