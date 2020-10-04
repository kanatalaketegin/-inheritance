import java.util.Scanner;

public class DaysOfWeek{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int numDay = scan.nextInt();

		if (numDay > 5 && numDay < 8) {
			System.out.println("Сегодня выходной");
		}
		else if (numDay >= 1 && numDay < 5) {
			System.out.println("Сегодня рабочий день");
		}
		else if (numDay == 5) {
			System.out.println("Сегодня пятница, пора на вечеринку");
		}
		else{
			System.out.println("Некорректный номер недели");
		}

	}
}