
import java.util.Arrays;

public class ArraysMethods {
    public static void main (String[] args) {
        System.out.println("Method fill: int[] a, int val");
        fill(new int[10], 33); //инициализация метода: размер массива 10, заменяемые число 33
        System.out.println();  //переход следующую строку

        System.out.println("Method fill: int[] a, fromIndex, toIndex, val");
        fill(new int[20], 4, 8,77);  //инициализация метода: 1-число размер индекса, 2-число начало индекса, 
        								// 3-число конец индекса, 
        								// 4-число число который заменят все элементы от 2го до 3го индекса
        System.out.println();			//переход на следующую строку

        System.out.println("Method copyOf: int[] original, int newLength");
        copyOf(new int [10], new int[12]); //инициализация метода: 1-размер массива, 2-добавленный новый размер массива
        System.out.println();				//переход на следуюущую строку

    }

    static void copyOf(int[] original, int[] newLength) { //метод copyOf
        for (int i = 0; i < original.length; i++) {			//пройдет цикл по размеру массива
            original[i] = (int) (Math.random()*20);			//задается элемент массива случайный чисел до 20
            System.out.print(original[i] + ", ");			//отрабражает на экран заданный все элементы
        }
        System.out.println();								//переход на следуюущую строку что бы было читабельным в экране
        newLength = Arrays.copyOf(original, 12);			//добавляем еще индекс массива
        newLength[10] = (int) (Math.random()*100);			//задаем добавленного индекса случайные числы
        newLength[11] = (int) (Math.random()*100);			//задаем добавленного индекса случайные числы

        for (int i = 0; i < newLength.length; i++) {		//пройдем по циклу по добавленному индексу
            System.out.print(newLength[i] + ", ");			//отображаем все элементы включая добавленные элементы в экран
        }

    }


    static void fill(int[] a, int val) {					// метод fill 
        for (int i = 0; i < a.length; i++) {				// пройдем по циклу по размеру массива
            a[i] = (int) (Math.random()*20);				// задаем элементы массива случайным числом
            System.out.print(a[i] + ", ");					// выводим экран все элементы массива
        }
        System.out.println();								// переходим следуюущую строку
        Arrays.fill(a, val);								// заменяем все элементы на одну числу
        System.out.println(Arrays.toString(a));				// выводим на экран замененные элементы

    }
    static void fill(int[] a, int fromIndex, int toIndex, int val) { //метод fill
         for (int i = 0; i < a.length; i++) {						  //пройдем по циклу
             a[i] = (int) (Math.random()*20);							//задаем элемент массива случайные числы
             System.out.print(a[i] + ", ");								//выводим экран заданные все элементы
         }
         System.out.println();											//переходим следуюущую строку
        Arrays.fill(a, fromIndex, toIndex, val);						//задаем с какого индекса начиная до какого индекса надо заменить элементы на одну цифру
        System.out.println(Arrays.toString(a));							//выводим экран резултата

    }

}
