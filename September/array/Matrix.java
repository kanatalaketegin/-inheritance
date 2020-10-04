
public class Matrix {
    public static void main (String[] args) {
        System.out.println("Первый метод в двухмерных массивах");
        createMatrix(2, 3);
        System.out.println("Второй метов в двухмерных массивах");
        createMatrix(3, 5);
    }

   public static void createMatrix(int a, int b) {

        int[][] array = new int[a][b];
       for (int i = 0; i < array.length; i++){
           for (int j = 0; j < array[i].length; j++) {
               array[i][j] = (int) (Math.random()*10);
               System.out.print(array[i][j] + " ");
           }
           System.out.println();
       }

       for (int [] k : array) {
       	massiv[k] = (int) (Math.random()*10);
       	System.out.println(k);
       }
    }
}