package ua.dp.ort.homework4;
import java.util.Scanner;

public class SixBitNumbers {

	public static void main(String[] args) {
//		8) ���� 6�� ������� �����, ������� ����� ���� ����� �� 100000 �� 999999
//	����������� ��������, � �������������� ������ �������������� ��������,
//	������� �� �������� ��� ����� ��������� 6�� ������� ����� 
//	��������� ����� ���� ��� �����.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number from 100 000 to 999 999.");
		int a = scanner.nextInt();
		int number1 = a / 100000;
		int number2 = a / 10000 % 10;
		int number3 = a / 1000 % 10;
		int number4 = a / 100 % 10;
		int number5 = a / 10 % 10;
		int number6 = a / 1 % 10;
		
		int sum = number1 + number2 + number3 + number4 + number5 + number6;
		
		System.out.println("The sum of 6th number is: " + sum);
		

	}

}
