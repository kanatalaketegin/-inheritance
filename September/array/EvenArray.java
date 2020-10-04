
public class EvenArray {

	public static void main (String[] args) {

		int[] array = new int[12];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);
			if (i % 2 == 0) {
				array[i] = 0;
			}
			System.out.println(array[i]);
		}
	}
}