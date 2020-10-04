import java.util.Scanner;

public class Program {

	public static void main (String [] args){

		Scanner sc = new Scanner(System.in);
		
		int a = 20;
		int b = 30;
		int c = 25;

		// boolean result = a > b ? (a > c ? a : c) : (b > c ? b : c);

		// System.out.println (result);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a);
		System.out.println(b);


	}
}