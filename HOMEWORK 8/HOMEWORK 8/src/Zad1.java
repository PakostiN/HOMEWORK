import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		System.out.println(
				"Напишете метод, който при подадено име отпечатва в конзолата Greetings, <name>! (Напишете програма, която тества този метод.");
		SayGreetings();

	}

	public static void SayGreetings() {
		Scanner test = new Scanner(System.in, "UTF-8");
		System.out.println("Write your Name!");
		String name = test.next();
		System.out.println("Write your Family!");
		String fam = test.next();
		System.out.println("GREETINGS >> " + name + " " + fam + "<<  ! WELCOME TO OUR JAVA WORLD ! :) ");
		test.close();
	}

}
