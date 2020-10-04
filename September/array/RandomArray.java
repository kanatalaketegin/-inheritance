
public class RandomArray {

	public static void main (String[] args) {

		int[] array = new int[10];
		int max = 0;
		int min = 10;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10);
			if (max <= array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
			sum += array[i];
			// System.out.println(array[i]);
		}
		System.out.println("Максимальное число " + max);
		System.out.println("Минимальное число " + min);
		System.out.println("Среднее число " + sum/10);

	}
}
