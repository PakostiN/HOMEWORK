
public class Zad4 {

	public static void main(String[] args) {
		System.out.println("Напишете програма, която принтира на екрана числата от 30 до 1 в обратен ред, подредени в 5 реда и 6 колони");
		int num = 30;
		
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 6; col++) {
				System.out.print(num-- + " ");
			}
			System.out.println(" ");
		}

	}

}
