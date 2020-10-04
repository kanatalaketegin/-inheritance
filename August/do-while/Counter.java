

public class Counter {

	public static void main (String[] args) {
		int num = -11;
		do {
			num ++;
			if (num == 0 || num == -5 || num == 5) {
				continue;
			}

			if (num == 11) {
				break;
			}

			System.out.println(num);
		}while (true);

	}
}