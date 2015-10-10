package com.company.OOP.Week4.interf;

/**
 * Created by User on 10.10.2015.
 */
public class CompanyTestInterfaces {
    public static void main(String[] args) {
        SuperPerson superPerson = new SuperPerson();
        University.testStudent(superPerson);
    }
}
class University{
    public static void testStudent(SuperPerson student){
        student.study();
    }
}

class Student implements StudentBehavior,Danceable {
    public void study() {
        System.out.println("Student studing");
    }

    @Override
    public void dance() {

    }
}
class Company{
    public static void testWorker(Worker worker){
        worker.work();
    }
}

class Worker{
    public void work(){
        System.out.println("Worker working");
    }
}
class SuperPerson implements StudentBehavior, WorkerBehavior{

    @Override
    public void study() {
        System.out.println("Superperson study");
    }

    @Override
    public void work() {
        System.out.println("SUperperson work");
    }
}

interface StudentBehavior{
    // all methods public and abstract
    // no constructor
    // no fields
    void study();
}

interface WorkerBehavior{
        void work();
}

class Club{
    public static void letUsDance(){

    }
}

interface Danceable{
    void dance();
}

interface SingerBehavior{
    void sing();
}

interface ArtistBehavior extends Danceable, SingerBehavior{
    //combine interfaces
}
abstract class Abiturient implements Danceable, StudentBehavior {
    @Override
    public void dance() {
        System.out.println("abiturient dancing");
    }
}
abstract class Runner{
    public void cross(int distance){
        sleep();
        eat();
        prepare();
        for (int i = 0; i < distance; i++) {
            doStep();
        }
    }

    protected abstract void eat();

    protected abstract void sleep();
    protected abstract void doStep();
    protected abstract void prepare();


}

class Sprinter extends Runner{
    @Override
    protected void eat() {
        System.out.println("Sprinter eat");
    }

    @Override
    protected void sleep() {
        System.out.println("Sprinter sleep");
    }

    @Override
    protected void doStep() {

    }

    @Override
    protected void prepare() {

    }
}