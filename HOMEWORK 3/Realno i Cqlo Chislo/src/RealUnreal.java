import java.util.Scanner;

public class RealUnreal {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("�������� ��������, ����� ������ ������ ����� ���� ����, � ������� �� ��������� ��������� �� ��������� �� � ���� �����.");
		System.out.println(" ");
		System.out.println(" (X / Y) = C");
		System.out.println(" ");
		System.out.println("�������� ������� (������ �����) : ");
		float x = test.nextFloat( );
		System.out.println(" ");
		System.out.println("�������� ������ (���� �����) :  ");
		int y = test.nextInt( );
		System.out.println(" ");
		float c = x/y;
		System.out.print("C = ");
		System.out.println(c);
		
		test.close();
	}

}
