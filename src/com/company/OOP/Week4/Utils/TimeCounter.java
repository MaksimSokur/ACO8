package com.company.OOP.Week4.Utils;

/**
 * Created by User on 10.10.2015.
 */
public class TimeCounter {
    public static String coutnTime(MyAction action){
        long start = System.currentTimeMillis();
        action.doAction();
        long end = System.currentTimeMillis();
    return String.format("Action time = %d millis", (end - start));
    }
}
