package ua.dp.ort.homework3;

public class Task1 {

	public static void main(String[] args) {
		//  1) Для каждого примитивного типа данных (byte short int long float double):
		// - придумать 3 значения которых можно в данном типе
		// - дать переменной осмысленное имя (согласно java convention)
		// - вывести значение переменной в консоль
		byte weekend = 0;
		byte maxNum = 127;
		byte minNum = -128;
		System.out.println("\n\nThe weekend days is: " + weekend + "\nThe maximum number of byte is: " + maxNum +"\nThe minimum number of byte is: " + minNum );
		
		short maxShort = 32767;
		short daysInYear = 365;
		short blueWhite = 15000;
		System.out.println("\n\nThe maximum value of short is: " + maxShort + "\nThe days in year is: " + daysInYear + "\nThe Blue-White is: " + blueWhite);
		
		int maxInt =  2147483647;
		int studyDays = 5;
		int iaRation = 700;
		System.out.println("\n\nThe maximum value of int is: " + maxInt + "\nThe study days in the week is: " + studyDays + "\nThe infrared radiation wavelenght is: " + iaRation);
		
		long maxLong = 9223372036854775807L;
		long worldPopulation = 7749457000L;
		long distanceToSun = 149600000L;
		System.out.println("\n\nThe maximum value of long is: " + maxLong + "\nThe world popuation is: " + worldPopulation + "\nThe distance to the Sun is: " + distanceToSun);
		
		float numOfPI = 3.14f;
		float studyHours = 9.7f;
		float radiusMars = 3389.5f;
		System.out.println("\n\nThe number pi is: " + numOfPI + "\nThe study hours is: " + studyHours + "\nThe radius of mars is; " + radiusMars);
		
		double plancksConst = 6.63E-34;
		double gammaRadiation = 2E-10;
		double visibleLight = 1.5E-5;
		System.out.println("\n\nThe Planks constant is: " + plancksConst + "\nThe wavelenght Gamma radiation is: " + gammaRadiation + "\nThe visible light inches is: " + visibleLight);
		
		char symbol1 = 34;
		char symbol2 = 23;
		char symbol3 = 86;
		System.out.println("\n\nThe symbol variable symbol1 is: " + symbol1 + "\nThe symbol variable symbol2 is: " + symbol2 + "\nThe symbol variable symbol3 is: " + symbol3);
	}

}
