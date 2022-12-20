public import java.util.Random;

public class Matrix_prepod {

    Random random = new Random();

   public int[][] createMatrix(int row, int col){
       int[][] mtx = new int[row][col];
       for (int i = 0; i < row; i++) {
           for (int j = 0; j < col; j++) {
               mtx[i][j] = random.nextInt(10);
           }
       }
      return mtx;
   }

   public void printMtx(int[][] mtx){
       for (int i = 0; i < mtx.length; i++) {           // Получили количество строк (высоту) матрицы
           for (int j = 0; j < mtx[i].length; j++) {    // Получили количество столбцов в строке
               System.out.printf("%5d", mtx[i][j]);     // Делаем форматированный вывод - 5 позиций на каждое число printf - print format(форматированный вывод)
           }
           System.out.println();
       }
   }

   public void findMaxes(int[][] mtx){
       for (int i = 0; i < mtx.length; i++) {
           int max = mtx[i][0];           // Присваиваем нулевое значение каждой строки в переменную
           for (int j = 0; j < mtx[i].length; j++) {
                if(mtx[i][j] > max){            // Проверяем, если элемент больше максимального, присваиваем его максимальному
                    max = mtx[i][j];
                }
           }
           int count = 0;



           for (int j = 0; j <= i; j++) {                 // Наработка для дз
               System.out.print(" ");
               count++;
           }

           for (int j = mtx.length - i - count; j > 0; j--) {
               System.out.print(" ");
           }


           System.out.println(max);
       }
   }

    public void findMinis(int[][] mtx){
        for (int i = 0; i < mtx.length; i++) {
            int min = mtx[i][0];           // Присваиваем нулевое значение каждой строки в переменную
            for (int j = 0; j < mtx[i].length; j++) {
                if(mtx[i][j] < min){            // Проверяем, если элемент больше максимального, присваиваем его максимальному
                    min = mtx[i][j];
                }
            }

            for (int j = mtx.length-i; j > 0; j--) {
                System.out.print(" ");
            }

            System.out.println(min);
        }
    }
} {
    
}
