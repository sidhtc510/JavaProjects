import java.util.Scanner;

/*
    ДЗ
    1) Создать калькулятор(+, -, *, /) в бесконечном цикле, но считать в функции
    2) Создать методы, для создания массива, заполнения его случайными числами и вывода на консоль.
    3) Метод для сортировки массива пузырьком по возрастанию и убыванию
    4) Создать метод для возведения в степень числа и *извлечения корня 3 степени из числа.
    5*) Реализовать игру "Камень, ножницы, бумага"
     */

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // CALCULATOR START
        // System.out.println("enter operation: \n" +
        // "plus: + \n" +
        // "minus: - \n" +
        // "multiply: * \n" +
        // "divide: / \n" +
        // "exit: e \n");
        // char ch = sc.next().charAt(0);

        // System.out.println("enter first num");
        // double fd = sc.nextDouble();
        // System.out.println("enter second num");
        // double sd = sc.nextDouble();

        // Calc calculator = new Calc();
        // calculator.startCalculation(ch, fd, sd);
        // CALCULATOR END

        // BUBBLE SORT START
        int[] arr = { 2, 45, 12, 6, 8, 9, 11, 10, 124, 1, 0, 3 };

        Bubble bubble = new Bubble();
        printArray(bubble.sortAsc(arr));
        printArray(bubble.sortDesc(arr));

        // for (int i = 0; i < arr.length; i++) {

        // System.out.print(bubble.sortDesc(arr));
        // }

        // BUBBLE SORT END

        // GAME START
        Game game = new Game();

        int i = 0;
        while (i < 10) {
        System.out.println("game # " + (i + 1));
        game.randomGame();
        i++;
        }

        // int i = 0;
        // while (i < 10) {
        //     System.out.println("game # " + (i + 1));
        //     System.out.println("choose 'rock', 'paper' or 'scisor'");
        //     game.singleGame(sc.next());
        //     i++;
        // }
        // GAME OVER
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
