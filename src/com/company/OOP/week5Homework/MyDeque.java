package com.company.OOP.week5Homework;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by User on 23.10.2015.
 */
public class MyDeque {
    public static void main(String[] args) {
        Deque myDeque = new LinkedList();
        myDeque.add("Main");
        myDeque.addFirst("Array");
        myDeque.addLast("Array 2");

        Iterator iterator = myDeque.iterator();

        while (iterator.hasNext()){
            String elemetn = (String) iterator.next();
        }

        for(Object object : myDeque){
            String element = (String) object;
            System.out.println(object);
        }

    }
}
