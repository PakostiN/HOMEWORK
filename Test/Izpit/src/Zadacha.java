import java.util.Scanner;

public class Zadacha {

	public static void main(String[] args) {
		System.out.println("������������ ������ �� ���� �� ������ ����� �� 2 �� 9,����� ����� ������������ ������ ������ �� ��������� �������� ����� �������.���������� ������ �� ���� �� ��������� ����� � ����� �� ������������ ��������,� ����� ���� �� �� ������� ����������� �������� ����� � �� ������� ��������� ����� � ���� �������.������������ ������ �� ���� �� ������ ������� ���������,�� �� ������� ���������� �����.���� ���� ����������� ����� � ��������,��� ������ �� ���� �������,�� �� �� ������� ������ ���� �� �������� �������� ���������.������ �� �� ������ �� ������.� ��������� ����� ������ �� �� �������� ����������� �� ����������. ����������� �� ��������� ����� ������ �� ����� ���������� ������� �� ������.");
		Scanner test = new Scanner(System.in, "UTF-8");
		System.out.println("�������� ����� �� 2 �� 9: ");
		int a = test.nextInt();
		if (a < 2 || a > 9) {
			System.out.println("������� � ����� ���������!");
		}

		int[] array = new int[a * a];
		for (int i = 0; i < array.length; i++) {
			System.out.println("�������� �����: ");
			array[i] = test.nextInt();

		}
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;

		}
		System.out.println(sum);
		int i = 0;
		int[][] matrix = new int[a][a];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[col][row] = array[i++];

			}

		}
		for (int j = 0; j < matrix.length; j++) {
			for (int j2 = 0; j2 < matrix.length; j2++) {
				System.out.print(matrix[j][j2] + " ");

			}
			System.out.println(" ");

		}
		test.close();
		
	}
}
	



