package com.company.OOP.tree;

/**
 * Created by User on 11.10.2015.
 */
public class CompanyManagerSystem {
    public  static int counterMoney(Worker worker){
        if(worker.subordinates == null){
            return worker.earnedMoney;
        }
        int amount = worker.earnedMoney;
        for (int i = 0; i <worker.subordinates.length || worker.subordinates[i] != null; i++) {
            Worker child = worker.subordinates[i];
            int cjildMoney = counterMoney(child);
            amount += cjildMoney;
        }
        return amount;
    }
}
