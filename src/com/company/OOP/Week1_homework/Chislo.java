package com.company.OOP.Week1_homework;

/**
 * Created by root on 22.09.15.
 */
public class Chislo {
	private int value;
	private int next_value;

	public int addition(int value, int next_value) {
		return value + next_value;
	}   //сложение

	public int subtraction(int value, int next_value) {
		return value - next_value;
	}   //вычитание

	public int multiplication(int value, int next_value) {
		return value * next_value;
	}   //умножение

	public double division(int value, int next_value) {
		return value / next_value;
	}   //деление

	public double multiplication_pow(int value, int next_value) {
		return Math.pow(value, next_value);
	}   //возведение в степень

	public int factorial(int value) {
		if (value == 0) return 1;
		return value * factorial(value - 1);
	}   //вычисление факториала

	public int residue(int value, int next_value) {
		return value % next_value;
	}   //вычисление остатка от деления

	public void comparing(int value, int next_value) {
		if (value > next_value) {
			System.out.print(value);
		} else if (value == next_value) {
			System.out.print(value & next_value);
		} else if (value < next_value) {
				System.out.print(next_value);
		}   //метод который сравнивает два числа
	}
}
