package ua.dp.ort.endcourse;

import java.util.Scanner;

public class RectagleWithCharacters {

	private static int getUserInputSide(Scanner scanner) {
		String userInputSides = scanner.nextLine();
		return Integer.parseInt(userInputSides);

	}

	private static char getUserInputCharacter(Scanner scanner) {
		String userInputCharacter = scanner.nextLine();		
		return userInputCharacter.charAt(0);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the character: ");
		char character = getUserInputCharacter(scanner);

		System.out.println("Enter width: ");
		int width = getUserInputSide(scanner);

		System.out.println("Enter height: ");
		int height = getUserInputSide(scanner);

		ToFilArrays.ArrayOutput(height, width, character); //Fill and output of array in console.
		scanner.close();

	}

}