package ua.dp.ort.homework4;

public class Distance {
	
		public static final float DISTANCE = 143f;
		public static final float JUMPS = 2.5f;
		
	public static void main(String[] args) {
//	6) Есть ограниченная дистанция, за которую нельзя выходить.
//	Дистанция равна 1 метр и 43 сантиметра.
//	Лягушка находиться посредине этой дистанции и начинает прыгать.
//	Каждый ее прыжок равен 2,5 сантиметра.
//	С помощью арифметических операций вычислить 
//	и вывести в консоль сколько полных прыжков лягушка может сделать.

		float wholeJumps =  DISTANCE / JUMPS;
		System.out.println((int)wholeJumps);
		
	}

}
