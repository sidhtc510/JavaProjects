import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter num 1");
        int a = scanner.nextInt();
        System.out.println("enter num 2");
        int b = scanner.nextInt();
        System.out.println("enter num 3");
        int c = scanner.nextInt();

        // minim(a,b,c);
        System.out.println(findMin(a, b, c));
    }

    // static public int minim(int a, int b, int c) {
    //     int min;
    //     if (a < b) {
    //         min = a;
    //         return a;
    //     } else {
    //         min = b;
    //         return b;
    //     }
    //     if(min > c){
    //         min = c;
    //         return c;
    //     }
    // }

    static int findMin(int a, int b, int c) {
        // 4. Найти меньшее значение из 3
        if (a <= b && a <= c) {
            return a; // 5. Вернуть это значение
        } else if (b <= c) {
            return b; // 5. Вернуть это значение
        } else {
            return c; // 5. Вернуть это значение
        }
    }

    static int findMin2(int a, int b, int c) {
        return Math.min(Math.min(a, b), Math.min(b, c));
    }
}
