import java.util.Scanner;

public class StringEQUALS {

	

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("�������� ����� �����, ����� �� ��������� ���� ����� ��� �� ������� (String) � ����� �� �Hello�. ����������� � ��������� ��������� �� ����������.");
		System.out.println(" ");
		System.out.println("�������� �������: ");
		String word = test.nextLine();
		System.out.print(word );
		System.out.print(" == Hello ");
		String hi = "Hello";
		boolean result = word.equals(hi);
		System.out.print("- ");
		System.out.println(result);


		
		
		test.close();
	}

}
