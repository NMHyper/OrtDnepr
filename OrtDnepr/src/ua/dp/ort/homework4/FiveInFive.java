package ua.dp.ort.homework4;

public class FiveInFive {

	public static void main(String[] args) {
//	2) Возвести число 5 в степень 5, с помощью 
//	- арифметических операций
//	- Math.pow
//	Оба результата вывести в консоль
		
		int a = 5;
		
		int powerFive = a * a * a * a * a;
		System.out.println("The five in the fifth power is: " + powerFive);
		
		System.out.println("The five in the fifth power is using Math.pow is " + Math.pow(a, a));

	}

}
