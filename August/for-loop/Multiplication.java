import java.util.Scanner;

public class Multiplication{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		if (num >= 0 && num < 11) {
			for (int i = 0; i <= 10; i++) {
			int a = i * num;
			System.out.println(i + " x " + num + " = " + a);
			}
		}
		else {
			System.out.println("Некорректный номер");
		}
	}
}