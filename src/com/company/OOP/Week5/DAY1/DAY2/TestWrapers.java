package com.company.OOP.Week5.DAY1.DAY2;

/**
 * Created by User on 18.10.2015.
 */
public class TestWrapers {
    public static void main(String[] args) {
        Integer i = new Integer(23);
        Double d1 = new Double(23.23);

        //AUTOBOXING
        Integer i2 = 45;

        //UNBOXING
        int res = 46 + i2;
        int res2 = 46 + i2.intValue();
    }
}
