package com.company.OOP.week3.company.day1;

/**
 * Created by User on 03.10.2015.
 */
public class TestInheritance {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.work();
        coder.writeCode();
        Manager manager = new Manager();
        manager.doTeamWork();
        manager.addEmployee(new Employer());
    }
}
