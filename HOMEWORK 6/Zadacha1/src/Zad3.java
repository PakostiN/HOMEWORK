
public class Zad3 {

	public static void main(String[] args) {
		System.out.println("�������� ��������, ����� ������� ����� � 10 �������� �� ���������� ��� � ������������ ���������� ��� �������� �������  ������� �� 10.");
		int result = 0;
		int[] MyArray = { 24, 43, 84, 34, 87, 34, 65, 12, 27, 64 };
		for (int row = 0; row < MyArray.length; row++) {
			if (row != 0) {

			}
			result = MyArray[row] * 10;

			System.out.println("������� �� ������ �������� �� 10 ��: " + row + " " + " : " + result);

		}

	}

}
