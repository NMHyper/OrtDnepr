package ua.dp.ort.homework4;

public class BitsOperation {

	public static void main(String[] args) {
//		9) У нас есть 8 бит, нумерация битов идет слева на право
//	1-7 бит это дни недели, бит установлен в 1 - день учитывается, в 0 - день не учитывается 
//	8й  бит это тип дня, бит установлен в 1 - рабочий день, в 0 - выходной день
//
//	с помощью побитовых операций определить
//	для 1111_1111, есть ли выходные дни
//	для 1111_1111, если ли рабочие дни
//	для 1010_0101, определить все рабочие дни
//	для 0001_1001, определить все выходные дни
//
//	Результаты вывести в консоль, если в консоль выводиться 0 это интерпретируется как отсутствие, 
//	если не 0 то наличие. Данная интерпретация используется для любого бита. 
		
		int firstWeek = 0b11111111;
		int secondWeek = 0b11111111;
		int thirdWeek = 0b10100101;
		int fourthWeek = 0b00011001;
		
		
		int weekendDays = 0b00000000;
		int result_WeekendDays = firstWeek & weekendDays;
		System.out.println("For 1111_1111, whether there is a weekend days: " +  result_WeekendDays);
		
		int workDays = 0b11111111;
		int result_WorkDays = secondWeek & workDays;
		System.out.println("For 1111_1111, whether there is a work days: " + result_WorkDays);
		
		int allWorkDays = 0b00000000;
		int result_AllWorkDays = thirdWeek | allWorkDays;
		System.out.println("For 1010_0101, to determine all work days: " + result_AllWorkDays);
		
		int allWeekendDays = 0b11111111;
		int result_AllWeekendDays = fourthWeek & allWeekendDays;
		System.out.println("For 0001_1001, to determine all weekend days: " + result_AllWeekendDays);
	}

}
