import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		System.out.println(
				"�������� ��������, ����� ������ �� ��������� 2 ����� a � b (b > a) � ������� �� ������ ������ ����� �� a �� b, ����� �� ����� �� 3 ��� �������");
		Scanner test = new Scanner(System.in, "UTF-8");
		System.out.println("�������� ������� �����: ");

		int a = test.nextInt();

		System.out.println("�������� ������� �����: ");

		int b = test.nextInt();
		if (a > b) {
			System.out.println("4ao");
		}

		for (int i = a; i < b; i++) {
			if (i < b && i % 3 == 0) {
				System.out.println(i);
			}

		}
		test.close();
	}
}