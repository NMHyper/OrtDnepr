package ua.dp.ort.homework5;

import java.util.Scanner;

public class EqualsOrNot {

	public static void main(String[] args) {
		/*
		 * 2) Написать программу - анализатор чисел.
		 *Программа должна позволять пользователю вводить два числа.
		 *И выводить в консоль информацию в случае, если:
		 *- число а равно числу б?
		 *- число а не равно числу б?
		 *- число а больше б?
		 *- число а больше или равно б?
		 *- число а меньше б?
		 *- число а меньше или равно б?
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number: ");
		double a = 0;
		a = scanner.nextDouble();

		System.out.println("Enter second number: ");
		double b = 0;
		b = scanner.nextDouble();

		if(a == b) {
			System.out.println("The first number is equal the second.");
		}else if(a < b) {
			System.out.println("The first number is less than the second.");
		}else {
			System.out.println("The first number is greater than the second.");
		}

		if(a >= b) {
			System.out.println("The first number is equal or grearer than the second.");
		}

		if(a <= b) {
			System.out.println("The first number is equal or less than the second number.");
		}


		if(a != b) {
			System.out.println("The first number is not equal the second.");
		}
	}

}
