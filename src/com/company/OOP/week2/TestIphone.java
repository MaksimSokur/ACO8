package com.company.OOP.week2;

/**
 * Created by User on 26.09.2015.
 */
public class TestIphone {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        IPhone IPhones = new IPhone("6s");

        IPhone Iphone5s = new IPhone("5", 70, "black" , 5);
        IPhone.CEO();
    }
}
