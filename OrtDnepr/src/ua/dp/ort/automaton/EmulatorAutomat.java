package ua.dp.ort.automaton;

import java.util.Scanner;

public class EmulatorAutomat {

	public static void main(String[] args) {
		/*
		 * Написать программу - эмулятор автомата, в котором можно приобрести напитки.
		 *Программа должна позволять вводить сумму, которая есть у покупателя. 
		 *Также предоставлять возможность выбора товара, который доступен для приобретения.
		 *Товар:
		 *кофе,       стоимость 5
		 *газировка,    стоимость 3
		 *кока-кола    стоимость 10
		 *пепси-кола    стоимость 10
		 *В случае если у клиента не достаточно денег, должно выводиться ссобщение об этом.
		 *В случае если у клиента достаточно денег для покупки, ему должно выводиться сообщение о том что:
		 *- какой товар он приобрел
		 *- какая цена у этого товара
		 *- сколько денег осталось у клиента
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the amount you have: ");
		String inputAmount;
		inputAmount = scanner.nextLine();
		float amount = Float.parseFloat(inputAmount);

		System.out.println("Choose the following: \n 1)Coffe worth 5 \n 2)Soda worth 3 \n 3)Coca-Cola worth 10 \n 4)Pepsi cola worth 10");
		String chooseUser;
		chooseUser = scanner.nextLine();
		int chooseInput;
		chooseInput= Integer.parseInt(chooseUser);

		if (chooseInput < 5 && chooseInput > 0) {
			switch(chooseInput){
			case 1:
				float coffe = 5f;

				if (amount >= coffe) {
					System.out.println("You bought the coffe for: " + coffe);
					System.out.println("On your balance left " + (amount - coffe));
				}else {
					System.out.println("You dont have enough money in your amount.");
				}
				break;
			case 2:
				float soda = 3f;

				if (amount >= 3) {
					System.out.println("You bought the soda for: " + soda);
					System.out.println("On your balance left " + (amount - soda));
				}else {
					System.out.println("You dont have enough money in your amount.");
				}
				break;
			case 3:
				float cocaCola = 10f;

				if(amount >= cocaCola) {
					System.out.println("You bought the Coca-Cola for: " + cocaCola);
					System.out.println("On your baance left: " + (amount - cocaCola));
				}else {
					System.out.println("You dont have enough money in your amount.");
				}
				break;
			case 4:
				float pepsiCola = 10f;

				if(amount >= pepsiCola) {
					System.out.println("You bought the Pepsi-Cola for:" + pepsiCola);
					System.out.println("On your balence left: " + (amount - pepsiCola));
				}else {
					System.out.println("You dont have enough money on your amount.");
				}
				break;
			}
		}else {
			System.out.println("Sorry, we dont have any product under the number: " + chooseInput);
		}

	}
}
