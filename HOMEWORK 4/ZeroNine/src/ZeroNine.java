import java.util.Scanner;

public class ZeroNine {

	private static Scanner test;

	public static void main(String[] args) {
		test = new Scanner(System.in, "UTF-8");
		System.out.println("�������� ��������, ����� ����� ������ ����� (0-9) � � ������� � ���� (�� ����. ����.");
		System.out.println(" ");
		System.out.println("Please submit number between 0 and 9:");
		int num = test.nextInt();
		if (num == 0) {
			System.out.println("The number is Zero");
		} else if (num == 1) {
			System.out.println("The Number is One");
		} else if (num == 2) {
			System.out.println("The Number is Two");
		} else if (num == 3) {
			System.out.println("The Number is Three");
		} else if (num == 4) {
			System.out.println("The Number is Four");
		} else if (num == 5) {
			System.out.println("The Number is Five");
		} else if (num == 6) {
			System.out.println("The Number is Six");
		} else if (num == 7) {
			System.out.println("The Number is Seven");
		} else if (num == 8) {
			System.out.println("The Number is Eight");
		} else if (num == 9) {
			System.out.println("The Number is Nine");
		} else {
			System.out.println("The number is out of interval");
		}
		test.close();
	}

}