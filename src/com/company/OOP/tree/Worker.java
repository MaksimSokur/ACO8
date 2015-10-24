package com.company.OOP.tree;

import java.util.ArrayList;

/**
 * Created by User on 11.10.2015.
 */
public class Worker {
    String type;
    int earnedMoney;
    Worker[] subordinates;

    public Worker(String type, int earnedMoney, Worker...subordinates) {
        this.type = type;
        this.earnedMoney = earnedMoney;
        this.subordinates = new Worker[5];
    }

    public void count(int...nums){

    }

}
