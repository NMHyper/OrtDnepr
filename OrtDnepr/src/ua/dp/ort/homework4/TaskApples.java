package ua.dp.ort.homework4;

public class TaskApples {

	public static void main(String[] args) {
//	5) ≈сть 11 €блок, эти €блоки раздали 3м дет€м так чтобы всем досталось одинаковое количество целых €блок.
//	с помощью арифметических операций вычислить
//	- сколько целых €блок досталось каждому ребенку
//	- сколько €блок осталось.
//	–езультаты вывести в консоль
		
		int apples = 11;
		int child = 3;

		int wholeApples = apples / child;
		System.out.println("The whole apples went to every child is: " + wholeApples);
		
		int leftApples = apples % child;
		System.out.println("The left apples is:  " + leftApples);

	}

}
