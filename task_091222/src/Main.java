import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] intArray = new int[10];
        intArray[4] = 7;

        double[] doubleArray = new double[10];
        String[] stringArray = new String[10];
        // stringArray={"text","text2"};

        Main main = new Main();
        main.printIntArray(intArray);

        printDoubleArray(doubleArray);

        printStringArray(stringArray);
    }

    public void printIntArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println(" ");
    }

    public static void printDoubleArray(double[] ints){
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println(" ");
    }

    public static void printStringArray(String[] str){
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println(" ");
    }
}
