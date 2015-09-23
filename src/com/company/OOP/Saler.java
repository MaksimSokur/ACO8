package com.company.OOP;

/**
 * fields properties
 */
public class Saler {
    private int id;
    private String NameSaler;
    private int age;
    private double salary;
    private String phone;

    public void showMe() {
        System.out.printf("id : %d, fullname : %s,age : %d, salary : %.2f", id, NameSaler, age, salary);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public void createSaler(int id, String NameSaler, int age, double salary) {

        this.id = id;
        this.NameSaler = NameSaler;
        this.age = age;
        this.salary = salary;

    }

}