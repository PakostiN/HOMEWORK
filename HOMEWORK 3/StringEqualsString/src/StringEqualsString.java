import java.util.Scanner;

public class StringEqualsString {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("�������� ��������, ����� ������ ��� ������� ���� ����. ���� ���� ��������� ���� 2��� ������ �� ������� � 1���. �������� ��������� �� ���������� �� ���������.");
		System.out.println(" ");
		System.out.println("���� �������� ������ ������: ");
		String word = test.nextLine();
		System.out.println("���� �������� ������ ������: ");
		String word1 = test.nextLine();
		if (word1.equals(word)){
			System.out.println("������ ������ �� ������� � ������");
		}
		else {
			System.out.println("������ ������ �� �� ������� � ������!");
		}
		test.close();
	}

}
