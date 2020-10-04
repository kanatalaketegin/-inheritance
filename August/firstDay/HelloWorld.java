
import java.util.Scanner;

public class HelloWorld {
	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);
			//как тебя зовут?
			System.out.println("Whats your name?");
			// ответ от терминала
			// строчный переменный
			String name = scan.nextLine();
			 // сколько тебе лет?
			System.out.println("how old are you?");
			// ответ от терминала, 
			int age = scan.nextInt();
			
			System.out.println("how are you?");
			scan.nextLine();

			String mood = scan.nextLine();

			System.out.println("My name is " + name + "," + " I am " + age);
			System.out.println("I'm in " + mood + " mood");

	}
}