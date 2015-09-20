package com.company.OOP;

import java.util.Scanner;

/**
 * Created by User on 20.09.2015.
 */
public class UseSaler {
    public static void main(String[] args) {
        Saler Jak = new Saler();
        Jak.createSaler(1, "Olga Ivanivna", 27, 1000);
        Jak.showMe();
        Saler Bob = new Saler();
        Bob.createSaler(2, "Mihailo Vasilovich", 60, 200);
        Bob.showMe();

        Saler[] salers = new Saler[10];
        salers[0] = Jak;
    }
}