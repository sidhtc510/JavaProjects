import java.util.Random;

public class Matrix {

    Random random = new Random();

    public int[][] createMatrix(int row, int col) {
        int[][] mtx = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mtx[i][j] = random.nextInt(10);
            }
        }
        return mtx;
    }

    public void createMatrixX(int row, int col) throws InterruptedException {
        int[][] mtx = new int[row][col];
        String str;
        
        for(int i = 0; i < mtx.length; i++){
            // System.out.println("(i = " + i + ", mtx.l = " + mtx.length+")");
            for (int j = 0; j < mtx[i].length; j++) {
                
                // System.out.println("j = " + j + ", mtx.l = " + (mtx.length - i - 1));
                if (j == i || j == mtx.length - i -1) {
                 mtx[i][j] = random.nextInt(10);
                 str = Integer.toString(mtx[i][j]);
                } else {
                 str = " ";
                }
                System.out.print(str);
            }
            System.out.println();
            Thread.sleep(50);
        }
    }

    public void createMatrixY(int row, int col) throws InterruptedException {
        int[][] mtx = new int[row][col];
        String str;
        
        for(int i = 0; i < mtx.length; i++){
            // System.out.println("(i = " + i + ", mtx.l = " + mtx.length+")");
            for (int j = 0; j < mtx[i].length; j++) {
                
                // System.out.println("j = " + j + ", mtx.l = " + (mtx.length - i - 1));
                if (j == i && j < (mtx.length )/2 || j == mtx.length - i -1) {
                 mtx[i][j] = random.nextInt(10);
                 str = Integer.toString(mtx[i][j]);
                } else {
                 str = " ";
                }
                // System.out.println(str);
                System.out.print(str);
            }
            System.out.println();
            Thread.sleep(50);
        }
    }

    public void createMatrix_i(int row, int col) throws InterruptedException {
        int[][] mtx = new int[row][col];
        String str;
        
        for(int i = 0; i < mtx.length; i++){
            // System.out.println("(i = " + i + ", mtx.l = " + mtx.length+")");
            for (int j = 0; j < mtx[i].length; j++) {
                
                // System.out.println("j = " + j + ", mtx.l = " + (mtx.length - i - 1));
                if (j == 0 || j==9 || j == mtx.length - i) {
                 mtx[i][j] = random.nextInt(10);
                 str = Integer.toString(mtx[i][j]);
                } else {
                 str = " ";
                }
                // System.out.println(str);
                System.out.print(str);
            }
            System.out.println();
            Thread.sleep(50);
        }
    }


    public void createMatrixZ(int row, int col) throws InterruptedException {
        int[][] mtx = new int[row][col];
        String str;
        
        for(int i = 0; i < mtx.length; i++){
            // System.out.println("(i = " + i + ", mtx.l = " + mtx.length+")");
            for (int j = 0; j < mtx[i].length; j++) {
                
                // System.out.println("j = " + j + ", mtx.l = " + (mtx.length - i - 1));
                if (i == 0 || i == 9 || j == mtx.length - i - 1) {
                 mtx[i][j] = random.nextInt(10);
                 str = Integer.toString(mtx[i][j]);
                } else {
                 str = " ";
                }
                // System.out.println(str);
                System.out.print(str);
            }
            System.out.println();
            Thread.sleep(50);
        }
    }
    public void printMtx(int[][] mtx) throws InterruptedException {
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.printf("%5d", mtx[i][j]);

            }
            System.out.println(" ");
            Thread.sleep(50);
        }
    }

    public void findMaxes(int[][] mtx) {

        for (int i = 0; i < mtx.length; i++) {
            int max = mtx[i][0];
            for (int j = 0; j < mtx[i].length; j++) {
                if (mtx[i][j] > max) {
                    max = mtx[i][j];
                }
            }
            // System.out.println("max in string "+ i +" - " + max);

            for (int j = 0; j < i * 1; j++) {
                System.out.print(" ");
            }

            System.out.println(max);
        }
    }
}
