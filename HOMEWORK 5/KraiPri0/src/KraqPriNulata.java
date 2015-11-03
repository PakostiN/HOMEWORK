import java.util.Scanner;

public class KraqPriNulata {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in, "UTF-8");
		System.out.println("Напишете програма, която кара потребителя за въвежда числа и ги сумира. Края на програмата настъпва, единствено когато потребителя въведе числото 0.");
		System.out.println(" ");
		int n;
		int sum = 0;
		for (;;) {
			System.out.println("МОЛЯ ВЪВЕДЕТЕ ЧИСЛО: ");
			n = test.nextInt();
			if (n == 0) {
				break;
			}
			sum = sum + n;
		}
		System.out.println("Сумата на числата е : " + sum);
		test.close();

	}

}
