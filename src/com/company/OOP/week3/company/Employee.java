package com.company.OOP.week3.company;

/**
 * Created by User on 03.10.2015.
 */
public class Employee {
    private  String name;
    private int age;
    private double salary;

    public Employee() {
        name = "Vasia";
        age = 25;
        salary = 1500;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public  void work(){
        System.out.println("employee");
    }
}
