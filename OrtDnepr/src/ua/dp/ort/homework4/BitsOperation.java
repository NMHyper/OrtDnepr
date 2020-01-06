package ua.dp.ort.homework4;

public class BitsOperation {

	public static void main(String[] args) {
//		9) � ��� ���� 8 ���, ��������� ����� ���� ����� �� �����
//	1-7 ��� ��� ��� ������, ��� ���������� � 1 - ���� �����������, � 0 - ���� �� ����������� 
//	8�  ��� ��� ��� ���, ��� ���������� � 1 - ������� ����, � 0 - �������� ����
//
//	� ������� ��������� �������� ����������
//	��� 1111_1111, ���� �� �������� ���
//	��� 1111_1111, ���� �� ������� ���
//	��� 1010_0101, ���������� ��� ������� ���
//	��� 0001_1001, ���������� ��� �������� ���
//
//	���������� ������� � �������, ���� � ������� ���������� 0 ��� ���������������� ��� ����������, 
//	���� �� 0 �� �������. ������ ������������� ������������ ��� ������ ����. 
		
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
