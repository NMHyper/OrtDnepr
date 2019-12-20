package ua.dp.ort.homework3;

public class Task1 {

	public static void main(String[] args) {
		//  1) Для каждого примитивного типа данных (byte short int long float double):
		// - придумать 3 значения которых можно в данном типе
		// - дать переменной осмысленное имя (согласно java convention)
		// - вывести значение переменной в консоль
		// для типа char создать 3 переменных, присвоить им код символа и вывести их в консоль
		byte weekend = 0;
		byte MaxNum = 127;
		byte MinNum = -128;
		System.out.println("\n\nThe weekend days is: " + weekend + "\nThe maximum number of byte is: " + MaxNum +"\nThe minimum number of byte is: " + MinNum );
		
		short MaxShort = 32767;
		short DaysInYear = 365;
		short BlueWhite = 15000;
		System.out.println("\n\nThe maximum value of short is: " + MaxShort + "\nThe days in year is: " + DaysInYear + "\nThe Blue-White is: " + BlueWhite);
		
		int MaxInt =  2147483647;
		int StudyDays = 5;
		int IR = 700;
		System.out.println("\n\nThe maximum value of int is: " + MaxInt + "\nThe study days in the week is: " + StudyDays + "\nThe infrared radiation wavelenght is: " + IR);
		
		long MaxLong = 9223372036854775807L;
		long WorldPopul = 7749457000L;
		long DisToSun = 149600000L;
		System.out.println("\n\nThe maximum value of long is: " + MaxLong + "\nThe world popuation is: " + WorldPopul + "\nThe distance to the Sun is: " + DisToSun);
		
		float NumOfPI = 3.14f;
		float StudyHours = 9.7f;
		float RadiusMars = 3389.5f;
		System.out.println("\n\nThe number pi is: " + NumOfPI + "\nThe study hours is: " + StudyHours + "\nThe radius of mars is; " + RadiusMars);
		
		double PlancksConst = 6.63E-34;
		double GammaRadiation = 2E-10;
		double VisibleLight = 1.5E-5;
		System.out.println("\n\nThe Planks constant is: " + PlancksConst + "\nThe wavelenght Gamma radiation is: " + GammaRadiation + "\nThe visible light inches is: " + VisibleLight);
		
		char symbol1 = 34;
		char symbol2 = 23;
		char symbol3 = 86;
		System.out.println("\n\nThe symbol variable symbol1 is: " + symbol1 + "\nThe symbol variable symbol2 is: " + symbol2 + "\nThe symbol variable symbol3 is: " + symbol3);
	}

}
