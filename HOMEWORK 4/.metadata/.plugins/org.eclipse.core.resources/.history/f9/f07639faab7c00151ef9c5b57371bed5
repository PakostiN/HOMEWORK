import java.util.Scanner;

public class BonusScores {

	private static Scanner test;

	public static void main(String[] args) {
		test = new Scanner (System.in, "UTF-8");
		System.out.println("Напишете програма, която изчислява бонус точки на база резултат от игра. Потребителят трябва да въведе своите точки в интервалa[1;9]. Ако точките са в интервала [1;3], умножете ги по 5. Ако точките са в интервала [4;6], умножете ги по 10. Ако точките са в интервала [7;9], умножете ги по 50. Резултатът изведете на екрана.");
		System.out.println(" ");
		System.out.println("Моля въведете вашите точки в интервала от 0 до 9:");
		int num = test.nextInt();
		if (num >= 1 && num <= 3){
			System.out.print("Вашите точки + бонуса са : ");
			System.out.println(num*5);
		}
		else if (num >=4 && num <=6) {
			System.out.print("Вашите точки + бонуса са : ");
			System.out.println(num*10);
		}
		else if (num >= 7 && num <= 9) {
			System.out.print("Вашите точки + бонуса са : ");
			System.out.println(num*50);
		}
		else {
			System.out.println("Невалиден брой точки!!");
		}
	test.close();
	}

}