import java.util.Scanner;

public class Nedelimi {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in, "UTF-8");
		System.out.println(
				"�������� ��������, ����� ��������� �� ��������� ������� �� 1 �� N, ����� �� �� ����� �� 3 � 7. ������� N �� ������� �� ���������.");
		System.out.println("���� �������� �����: ");
		int num = test.nextInt();
		for (int i = 1; i < num; i++) {
			if (i % 3 != 0 && i % 7 != 0) {
				System.out.println(i);
			}
		}
		test.close();

	}

}
