package ua.dp.ort.homework5;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		/**
		 * 1) Написать программу которая позволяет вычислить площадь прямоугольника.
		 *Программа должна позволять пользователю вводить значение сторон 
		 *прямоугольника с клавиатуры.
		 *Результат вычислений должен выводиться в консоль.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first side: ");
		double firstSide = 0;
		firstSide = scanner.nextDouble();

		System.out.println("Enter second side: ");
		double secondSide = 0;
		secondSide = scanner.nextDouble();

		double area = firstSide * secondSide;
		System.out.println("Area of your regtangel is: " + area);

	}

}
