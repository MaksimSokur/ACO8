package com.company.OOP.week3.company.day1;

/**
 * Created by User on 03.10.2015.
 */
public class Manager extends Employer {

    private int countEmployee;

    private Employer[] employers;

    public Manager(String name, int age, double salary, Employer[] employers) {
        super(name, age, salary);
        this.employers = employers;
    }

    public Manager() {
        employers = new Employer[10];
    }

    public void addEmployee(Employer employer){
        employers[countEmployee++] = employer;
    }

    public void doTeamWork(){
        for (int i = 0; i < countEmployee ; i++) {
            Employer emloyee = employers[i];
            emloyee.work();
            }
        }
}
