package com.company.OOP.week3.company;

import java.util.Scanner;

/**
 * Created by User on 03.10.2015.
 */
public class Manager extends Employee{
    private Coder[] coders;
    private Tester[] testers;
    private int countCoder;
    private int countTester;
    private int countEmployee;

    private Employee[] employees;

    public Manager() {
        employees = new Employee[10];
    }

    public void addEmployee(Employee employee){
        employees[countEmployee++] = employee;
    }

    public void addCoder(Coder coder){
          coders[countCoder++] = coder;

    }

    public void addTester(Tester tester){
        testers[countTester++] = tester;
        }


    public void doTeamWork(){
        for (int i = 0; i < testers.length ; i++) {
            Employee emloyee = employees[i];
            emloyee.work();
            }
        }
    }
    public Coder[] getCoders() {
        return coders;
    }

    public void setCoders(Coder[] coders) {
        this.coders = coders;
    }

    public Tester[] getTesters() {
        return testers;
    }

    public void setTesters(Tester[] testers) {
        this.testers = testers;
    }
}
