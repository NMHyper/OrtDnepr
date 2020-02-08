package ua.dp.ort.homework5;

import java.util.Scanner;

public class TypeShape {

	public static void main(String[] args) {
		/*
		 * 3) Написать программу, которая позволяет определить тип фигуры,
		 * квадрат или прямоугольник.
		 *Значение сторон фигуры должны вводиться с клавиатуры.
		 *Результат работы программы это вывод в консоль типа фигуры.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first side: ");
		double firstSide = 0;
		firstSide = scanner.nextDouble();

		System.out.println("Enter second side: ");
		double secondSide = 0;
		secondSide = scanner.nextDouble();

		if(firstSide != secondSide) {
			System.out.println("This is a rectangle.");
		}else {
			System.out.println("This is a square.");
		}

	}

}
