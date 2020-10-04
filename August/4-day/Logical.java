import java.util.Scanner;

public class Logical{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		boolean a = scan.nextBoolean();
		boolean b = scan.nextBoolean();

		System.out.println("a & b = " + (a & b));
		System.out.println("a | b = " + (a | b));
		System.out.println("a ^ b = " + (a ^ b));
		System.out.println("!a = " + !a);
		System.out.println("!b = " + !b);
		System.out.println("a && b  = " + (a && b));
		System.out.println("a || b  = " + (a || b));
	}
}