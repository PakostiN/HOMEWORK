import java.util.Scanner;

public class KraqPriNulata {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in, "UTF-8");
		System.out.println("�������� ��������, ����� ���� ����������� �� ������� ����� � �� ������. ���� �� ���������� ��������, ���������� ������ ����������� ������ ������� 0.");
		System.out.println(" ");
		int n;
		int sum = 0;
		for (;;) {
			System.out.println("���� �������� �����: ");
			n = test.nextInt();
			if (n == 0) {
				break;
			}
			sum = sum + n;
		}
		System.out.println("������ �� ������� � : " + sum);
		test.close();

	}

}
