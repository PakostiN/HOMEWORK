import java.util.Scanner;

public class Liceto {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in, "UTF-8");
		System.out.println("Направете програма, която приема две цели числа - съответно страната и височината на триъгълник. Пресметнете лицето на дадения триъгълник и я изведете на конзолата."
);
		System.out.println(" ");
		System.out.println("... S = (a*ha)/2 ... S = (b*hb)/2 ... S = (c*hc)/2 ...");
		System.out.print("Моля въведете дължината на дадената страна: ");
		int a = test.nextInt( );
		System.out.println(" ");
		System.out.print("Моля въведете дължината на височината към дадената страна: ");
		int ha = test.nextInt( );
		System.out.print("S = ");
		System.out.print("(");
		System.out.print(a);
		System.out.print(" * ");
		System.out.print(ha);
		System.out.print(")");
		System.out.println(" / 2");
		System.out.print("S = ");
		float S = (a*ha)/2f;
		System.out.println(S);
		
		test.close();
	}

}
