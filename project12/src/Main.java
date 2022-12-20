import java.util.Random;

public class Main {
    static Random random = new Random();
    static int[][] mtx = new int[100][100];

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        Matrix matrix = new Matrix();
        // for (int i = 0; i < 100; i++) {
        // for (int j = 0; j < 100; j++) {
        // mtx[i][j] = random.nextInt(10);
        // System.out.print(mtx[i][j] + " ");
        // }

        // System.out.println(" ");
        // Thread.sleep(100);
        // }

        // int[][] mtx = matrix.createMatrix(10, 10);
        // matrix.printMtx(mtx);
        // matrix.findMaxes(mtx);

        matrix.createMatrixX(11,11);
        System.out.println(" ");
        matrix.createMatrixY(11,11);
        System.out.println(" ");
        // matrix.createMatrix_i(10,10);
        // System.out.println(" ");
        matrix.createMatrixZ(10,10);



        // Human h1 = new Human(22, "lena", "f");
        // Human h2 = new Human(22, "lena", "f");

        // System.out.println(h1 == h2);
        // System.out.println(h1.equals(h2));

        // Human h3 = h1;

        // System.out.println(h3);

        // h3.setSex("m");

        // System.out.println(h1);
        // System.out.println(h3);

        // Human h4 = (Human) h2.clone();
        // System.out.println(h2);
        // System.out.println(h4);

        // h2.setAge(23);
        // System.out.println(h2);
        // System.out.println(h4);

    }

}
