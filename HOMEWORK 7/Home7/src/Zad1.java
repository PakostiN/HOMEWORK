
public class Zad1 {

	public static void main(String[] args) {
		System.out.println(
				"�������� ��������, ����� ������� ������������� �������� �������� ����� �� ����� � ������� �� ������ ���� �������.");
		int result = 0;
		int[][] Matrix = { { 1, 2, 3 }, 
				{ 7, 8, 9 },
				{ 13, 14, 15 } };
		for (int row = 0; row < Matrix.length; row++) {

			for (int col = 0; col < Matrix.length; col++) {
				if (Matrix[row][col] % 2 == 0) {
					result = Matrix[row][col];

				}

			}
			System.out.println(result);

		}

	}
}
