
public class Zad4 {

	public static void main(String[] args) {
		System.out.println("�������� ��������, ����� �������� �� ������ ������� �� 30 �� 1 � ������� ���, ��������� � 5 ���� � 6 ������");
		int num = 30;
		
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 6; col++) {
				System.out.print(num-- + " ");
			}
			System.out.println(" ");
		}

	}

}
