import java.util.Scanner;

public class StringEQUALS {

	

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("Напишете булев израз, който да проверява дали даден низ от символи (String) е равен на „Hello”. Отпечатайте в конзолата резултата от проверката.");
		System.out.println(" ");
		System.out.println("Въведете символи: ");
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
