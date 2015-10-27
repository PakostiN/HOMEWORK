import java.util.Scanner;

public class StringEqualsString {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("Напишете програма, която приема два стринга като вход. След това проверява дали 2рия стринг се съдържа в 1вия. Покажете резултата от проверката на конзолата.");
		System.out.println(" ");
		System.out.println("Моля въведете първия стринг: ");
		String word = test.nextLine();
		System.out.println("Моля въведете втория стринг: ");
		String word1 = test.nextLine();
		if (word1.equals(word)){
			System.out.println("Втория стринг се съдържа в първия");
		}
		else {
			System.out.println("Втория стринг не се съдържа в първия!");
		}
		test.close();
	}

}
