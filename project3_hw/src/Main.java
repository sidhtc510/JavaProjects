import java.util.Scanner;

// 1) Метод(процедура), которая будет считывать значения и выводить их на консоль
// 2) Метод(Функция), которая будет считывать 3 значения и возвращать их сумму
// 3*) Сделать глобальную переменную static Scanner и считать два значения в методе main, передать их в функцию, вычислить
// их разность и вывести на консоль их метода main

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        firstTask();

        System.out.println("result = " + secondTask());

        System.out.println("enter first num");
        int x = scanner.nextInt();
        System.out.println("enter second num");
        int y = scanner.nextInt();

        System.out.println("result = " + superCalculator(x, y));
    }

    public static void firstTask() {
        System.out.println("enter string");
        String str = scanner.nextLine();
        System.out.println(str);
    }

    public static int secondTask() {
        System.out.println("enter first num");
        int a = scanner.nextInt();
        System.out.println("enter second num");
        int b = scanner.nextInt();
        System.out.println("enter third num");
        int c = scanner.nextInt();

        return a + b + c;
    }

    public static int superCalculator(int firstArg, int secondArg) {
        return firstArg - secondArg;
    }
}
