package com.company.OOP.week3.company;

/**
 * Created by User on 03.10.2015.
 */
public class TestInheritance {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.work();
        coder.writeCode();
        Manager manager = new Manager();
        manager.addCoder(new Coder());
        manager.addTester(new Tester());
    }
}
