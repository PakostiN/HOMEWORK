import java.util.Scanner;

public class Zadacha {

	public static void main(String[] args) {
		System.out.println("Потребителят трябва да може да въведе число от 2 до 9,което число представлява едната страна на квадратен двумерен масив МАТРИЦА.Програмата трябва да може да пресметне колко е броят на необходимите елементи,с които може да се попълни квадратният двумерен масив и да създаде едномерен масив с тази дължина.Потребителят трябва да може да въведе толкова стойности,че да попълни едномерния масив.След като едномерният масив е попълнен,той трябва да бъде обходен,за да се изчисли общата сума от всичките въведени стойности.Сумата да се изпише на екрана.В двумерния масив трябва да се попълнят стойностите от едномерния. Попълването на двумерния масив трябва да стане вертикално КОЛКОНА ПО КОЛОНА.");
		Scanner test = new Scanner(System.in, "UTF-8");
		System.out.println("Въведете число от 2 до 9: ");
		int a = test.nextInt();
		if (a < 2 || a > 9) {
			System.out.println("Числото е извън интервала!");
		}

		int[] array = new int[a * a];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Въведете число: ");
			array[i] = test.nextInt();

		}
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;

		}
		System.out.println(sum);
		int i = 0;
		int[][] matrix = new int[a][a];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[col][row] = array[i++];

			}

		}
		for (int j = 0; j < matrix.length; j++) {
			for (int j2 = 0; j2 < matrix.length; j2++) {
				System.out.print(matrix[j][j2] + " ");

			}
			System.out.println(" ");

		}
		test.close();
		
	}
}
	



