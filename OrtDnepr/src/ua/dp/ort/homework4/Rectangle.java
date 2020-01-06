package ua.dp.ort.homework4;

public class Rectangle {

	public static void main(String[] args) {
//	4) Даны стороны прямоугольника
//	x = 4.5 метра
//	y = 3.1 метра
//	с помощью арифметических операций вычислить и вывести в консоль 
//	- площадь прямоуголька
//	- количество полных квадратных метров площади
		
		float x = 4.5f;
		float y = 3.1f;
		
		float areaRectangle = x * y;
		System.out.println("The area of rectangle is: " + areaRectangle);
		
		System.out.println("The full square meters of area is: " + Math.floor(areaRectangle));
	}

}
