import java.util.Arrays;
import java.util.Scanner;

/*
1) Создать массивы типа: int, double и создать методы, для их вывода на консоль
2) Сделать программу, которая будет складывать или вычитать введенные числа многократно,
пока не будет дана команда на выход из цикла
3*) Сделать процедуру для вывода из массива чисел со значением кратным 3. Найти в другой функции их среднее
арифметическое значение
4*) Перевернуть массив(реверсировать) и вывести из него все значения на нечетных позициях.
5**) Создать метод, который будет принимать строку и выводить из нее только гласные буквы

 */

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // int[] arr_i = new int [10];
        // double[] arr_d = new double [10];

        int[] arr_i = { 1, 3, 4, 5, 6, 7, 8, 9, 12, 15, 18, 21, 24 };
        double[] arr_d = { 1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1, 8.1, 9.1 };
        String input = "Hello World and Hello Anatoliy";

        // task 1
        // render_i(arr_i);
        // render_d(arr_d);

        // task 2
        calc();

        // task 3
        kratn_trem(arr_i);

        // task 4
        // reverseArr(arr_i);

        // task 5
        // String vowels = getVowels(input);
        // System.out.println(vowels);
    }

    // task 1 --START
    // public static void render_i(int[] a) {
    // for (int i = 0; i < a.length; i++) {
    // System.out.println(a[i]);
    // }
    // }

    // public static void render_d(double[] a) {
    // for (int i = 0; i < a.length; i++) {
    // System.out.println(a[i]);
    // }
    // }
    // task 1 -- END

    // task 2 -- start
    public static void calc() {
        int x = 0;
        while (true) {

            System.out.println("enter num");
            String dig = scanner.nextLine();

            if (dig.charAt(0) == 'e') {
                break;
            }
            x += Integer.parseInt(dig);
            System.out.println("common - '" + x + "'  (to exit press \"e\")");

        }
    }
    // task 2 -- END

    // task 3 -- START
    public static void kratn_trem(int[] argum) {
        int[] arr = new int[13];
        for (int i = 0; i < argum.length; i++) {
            if (argum[i] % 3 == 0 && argum[i] != 0) {
                arr[i] += argum[i];
                System.out.println(arr[i]);
            }
        }
        sredn(Arrays.toString(arr));
    }

    public static void sredn(String str) {
        String[] strArray = null;
        for (int i = 0; i < str.length(); i++) {

            str = str.replace("0,", "");
            str = str.replace("0", "");
            str = str.replace(" ", "");
            str = str.replace("[", "");
            str = str.replace("]", "");
            strArray = str.split(",");
        }
        double sredn = 0;
        for (int i = 0; i < strArray.length; i++) {
            sredn += Integer.parseInt(strArray[i]);
        }
        sredn = sredn / strArray.length;
        System.out.println(sredn);
    }
    // task3 -- END

    // task 4 -- START
    public static void reverseArr(int[] arg) {
        for (int i = arg.length - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.println("key: " + i + " ------ value: " + arg[i]);
            }

        }
    }
    // task 4 -- END

    // task 5 --START --- process -> https://www.youtube.com/watch?v=9B0dXtcbKXQ
    public static String getVowels(String input) {
        StringBuilder vowels = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
                    || c == 'U' || c == 'y' || c == 'Y') {
                vowels.append(c);
            }
        }
        return vowels.toString();
    }
    // task 5 --END
}