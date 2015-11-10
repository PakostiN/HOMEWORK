
public class Zad2 {

	public static void main(String[] args) {
		System.out.println("Напишете програма, която попълва числата на Фибоначи в масив. Потребител въвежда колко да е голям масива.");
		int[] Fib = new int[30];
		Fib[0] = 0;
		Fib[1] = 1;
		System.out.println("Fibo[0] = 0");
		System.out.println("Fibo[1] = 1");
		
		for (int i = 2; i < Fib.length; i++){
			Fib[i] = Fib[i - 1] + Fib[i - 2];
			System.out.println("Fib[[" + i + "]]" + " = " + Fib[i]);
		}
	}

}
