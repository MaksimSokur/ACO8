package com.company.OOP.Week2_homework.student;

import java.util.Scanner;

/**
 * Created by User on 02.10.2015.
 */
public class MenuObject {
    private CreateStudent student;
    public MenuObject() { initStudentMenu();}

    private void initStudentMenu() {
        student = new CreateStudent("Nikolai", "Kiev, Khreshatic");
        student.addObject(new Object("Informatica", 65, 12, 12));
        student.addObject(new Object("History", 48, 5, 10));
        student.addObject(new Object("Mathematic", 75, 15, 15));
    }
    public void startMenu(){
        Scanner sc = new Scanner(System.in);

        int choice = -1;
        while(choice != 9){
            showMenu();
            choice = sc.nextInt();

            if(choice == 1){
                addObjectMenu(sc);
            } else if(choice == 2){
                showAllMenu();
            } else if(choice == 3){
                deleteLastObjectMenu();
            }else if(choice == 4){
                toPassAnExamen();
            }

        }
    }

    private void deleteLastObjectMenu() {
        Object last = student.deleteLastObject();
        last.showInformationAboutObject();
    }

    private void showAllMenu() {
        student.showAllObjects();
    }

    public void showMenu(){
        System.out.println("\n1.Add Object");
        System.out.println("2.Show Object");
        System.out.println("3.Take last object");
        System.out.println("4.To pass an examen");
        System.out.println("9.Exit");
    }
    public void addObjectMenu(Scanner sc){
        System.out.println("Input Object name");
        String nameObject = sc.next();
        System.out.println("Input value of hours in semestr");
        int hoursInSemestr = sc.nextInt();

        Object newObject = new Object(nameObject,hoursInSemestr);

        student.addObject(newObject);
    }
    public void toPassAnExamen(){
        student.toPassAnExam();
    }

}
