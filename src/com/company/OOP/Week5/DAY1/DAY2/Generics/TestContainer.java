package com.company.OOP.Week5.DAY1.DAY2.Generics;

/**
 * Created by User on 18.10.2015.
 */
public class TestContainer {
    public static void main(String[] args) {
        Container<Integer> container = new Container<>(23);

        container.getValue();
    }

}
