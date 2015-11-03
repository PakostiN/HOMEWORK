import java.util.Scanner;

public class Nedelimi {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in, "UTF-8");
		System.out.println(
				"Напишете програма, която отпечатва на конзолата числата от 1 до N, които не се делят на 3 и 7. Числото N се въвежда от конзолата.");
		System.out.println("Моля въведете число: ");
		int num = test.nextInt();
		for (int i = 1; i < num; i++) {
			if (i % 3 != 0 && i % 7 != 0) {
				System.out.println(i);
			}
		}
		test.close();

	}

}
