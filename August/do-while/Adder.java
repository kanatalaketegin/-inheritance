import java.util.Scanner;

public class Adder {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);

		String symbol = "y";

		do {
			System.out.print("Enter the first number: ");
			int firstNumber = scan.nextInt();
			System.out.print("Enter the second number: ");
			int secondNumber = scan.nextInt();
			int sum = firstNumber + secondNumber;
			System.out.println ("result: " + sum);
			System.out.print("Do you want to continue y/n? ");
			symbol = scan.next();

		} while(symbol.equals("y")||symbol.equals("Y"));

		if (symbol.equals("n")) {
		 	System.out.println("Operation completed");
		 } 
		 else{
		 	System.out.println("The character is not entered correctly");
		 }

		
	}
}