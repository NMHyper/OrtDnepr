package ua.dp.ort.homework4;

public class TwoNumbers {

	public static void main(String[] args) {
//	1) Дано 2 числа 
//	а = 5;
//	b = 10;
//	Для этих чисел найти
//	- сумму
//	- разность
//	- произведение
//	- частное
//	Все результаты вывести в консоль
		
		int a = 5;
		int b = 10;
		
		int sum = a + b;
		System.out.println("The sum of a and b is: " + sum);
		
		int difference = a - b;
		System.out.println("The difference of a and b is: " + difference);
		
		int multiplication = a * b;
		System.out.println("The multiplication of a and b is: " + multiplication);

		float division = (float)a  / (float)b ;
		System.out.println("The  division a and b is: " + division);
	}

}
