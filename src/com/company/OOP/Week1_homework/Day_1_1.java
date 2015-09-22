package com.company.OOP.Week1_homework;

import java.util.Scanner;

/**
 * Created by root on 22.09.15.
 */
public class Day_1_1 {
	public static void main(String[] args) {
		int first_value, second_value;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter first Value: ");
		first_value = in.nextInt();
		System.out.print("Enter second Value: ");
		second_value = in.nextInt();

		Chislo result = new Chislo();

		System.out.print(result.addition(first_value, second_value));
		System.out.print('\n');
		System.out.print(result.division(first_value, second_value));
		System.out.print('\n');
		System.out.print(result.factorial(first_value));
		System.out.print('\n');
		System.out.print(result.multiplication(first_value,second_value));
		System.out.print('\n');
		System.out.print(result.multiplication_pow(first_value,second_value));
		System.out.print('\n');
		System.out.print(result.residue(first_value,second_value));
		System.out.print('\n');
		System.out.print(result.subtraction(first_value,second_value));
		System.out.print('\n');
		result.comparing(second_value, first_value);

	}

}
