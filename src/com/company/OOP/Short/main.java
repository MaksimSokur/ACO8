package com.company.OOP.Short;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int oneFirst, oneSecond, twoFirst, twoSecond;
        System.out.println("Enter first decimal: ");
        Scanner scanner = new Scanner(System.in);
        oneFirst = scanner.nextInt();
        System.out.println("-");
        oneSecond = scanner.nextInt();
        System.out.println("Next Decimal: ");
        twoFirst = scanner.nextInt();
        System.out.println("-");
        twoSecond = scanner.nextInt();

        Decimal decimal = new Decimal();

        System.out.println(decimal.Addition(oneFirst, oneSecond, twoFirst, twoSecond));
        System.out.println(decimal.Substraction(oneFirst, oneSecond, twoFirst, twoSecond));
        System.out.println(decimal.Multiplication(oneFirst, oneSecond, twoFirst, twoSecond));
        System.out.println(decimal.Division(oneFirst, oneSecond, twoFirst, twoSecond));
        decimal.Comparing(oneFirst, oneSecond, twoFirst, twoSecond);
    }
}