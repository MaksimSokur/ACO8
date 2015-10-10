package com.company.OOP.week3.company.day1;

/**
 * Created by User on 03.10.2015.
 */
public class Tester extends Employer {
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Tester(String name, int age, double salary, String test) {
        super(name, age, salary);
        this.test = test;
    }

    public void testCode(){
        System.out.println("tester tests");
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
