import java.util.Scanner;

public class Delenie {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("��������, ����� ������ 2 ����������� ����� �� ���� � ������� �������� �� ��������� �� �������:");
		System.out.println(" ");
		System.out.println("C = X % Y");
		System.out.println(" ");
		System.out.println("���� �������� ������: ");
		System.out.print("X = ");
		int x = test.nextInt( );
		System.out.println("���� �������� �������: ");
		System.out.print("Y = ");
		int y = test.nextInt( );
		int c = x % y;
		System.out.println(" ");
		System.out.println("C = X % Y");
		System.out.print("�������: ");
		System.out.println(c);
		
		test.close();
	}

}
