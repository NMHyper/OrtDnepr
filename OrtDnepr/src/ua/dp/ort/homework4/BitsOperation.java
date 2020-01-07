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
		
		//////////////// task1 and task 2
	    short task1And2 = 0b1111_1111;
	    short workWeekType = 0b0000_0001; 
	    System.out.println(task1And2 & workWeekType); //the result is non zero, so we have only work days
	    
	    
	    //////////////// task3
	    short task3 =     0b1010_0101;
	    System.out.println(task3 & workWeekType); //the result is non zero, so we have only work days
	    
	    short monday =    0b1000_0000;
	    short tuesday =   0b0100_0000;
	    short wednesday = 0b0010_0000;
	    short thursday =  0b0001_0000;
	    short friday =    0b0000_1000;
	    short saturday =  0b0000_0100;
	    short sunday =    0b0000_0010;
	    
	    System.out.println(task3 & monday);   //the result is not zero, so the Monday is work day.
	    System.out.println(task3 & tuesday);   //the result is zero, so the Tuesday is not work day.
	    System.out.println(task3 & wednesday);   //the result is not zero, so the Wednesday is work day.
	    System.out.println(task3 & thursday);   //the result is zero, so the Thursday is not work day.
	    System.out.println(task3 & friday);   //the result is zero, so the Friday is not work day.
	    System.out.println(task3 & saturday);   //the result is not zero, so the Saturday is work day.
	    System.out.println(task3 & sunday);   //the result is zero, so the Sunday is not work day.

	    
	    //////////////// task4
	    short task4 =     0b0001_1001;
	    System.out.println(task4 & workWeekType); //the result is non zero, so we have only work days
	    System.out.println(task4 & monday);   //the result is zero, so the Monday is not work day.
	    System.out.println(task4 & tuesday);   //the result is zero, so the Tuesday is not work day.
	    System.out.println(task4 & wednesday);   //the result is zero, so the Wednesday is not work day.
	    System.out.println(task4 & thursday);   //the result is not zero, so the Thursday is work day.
	    System.out.println(task4 & friday);   //the result is not zero, so the Friday is work day.
	    System.out.println(task4 & saturday);   //the result is zero, so the Saturday is not work day.
	    System.out.println(task4 & sunday);   //the result is zero, so the Sunday is not work day.
	}

}
