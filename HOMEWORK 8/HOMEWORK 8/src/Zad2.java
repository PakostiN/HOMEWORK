import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		System.out.println(
				"Дефинирайте метод, който приема 3 параметъра - цели числа и ги умножава едно с друго. Извикайте функцията 10 пъти с различни произволни числа.");
		NumbersMultiplication();

	}

	public static void NumbersMultiplication() {
		Scanner test = new Scanner(System.in, "UTF-8");
		int result = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Въведете първото число: ");
			int num1 = test.nextInt();
			System.out.println("Въведете второто число: ");
			int num2 = test.nextInt();
			System.out.println("Въведете третото число: ");
			int num3 = test.nextInt();
			if (i < 10)
				;
			result = num1 * num2 * num3;
			System.out.println("Резултатът от умножението на вашите числа е: " + result);

		}
		test.close();

	}

}
