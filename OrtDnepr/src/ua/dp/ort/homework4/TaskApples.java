package ua.dp.ort.homework4;

public class TaskApples {

	public static void main(String[] args) {
//	5) ���� 11 �����, ��� ������ ������� 3� ����� ��� ����� ���� ��������� ���������� ���������� ����� �����.
//	� ������� �������������� �������� ���������
//	- ������� ����� ����� ��������� ������� �������
//	- ������� ����� ��������.
//	���������� ������� � �������
		
		int apples = 11;
		int child = 3;

		int wholeApples = apples / child;
		System.out.println("The whole apples went to every child is: " + wholeApples);
		
		int leftApples = apples % child;
		System.out.println("The left apples is:  " + leftApples);

	}

}
