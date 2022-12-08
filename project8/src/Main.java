import java.util.Scanner;

public class Main {

    boolean isFlag = false;
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

        // Calculator calculator = new Calculator();
        // calculator.startCalculation(ch, fd, sd);
        // CALCULATOR END

        // GAME START
        Game game = new Game();
        // int i = 0;
        // while (i < 10) {
        //     System.out.println("game # " + (i + 1));
        //     game.randomGame();
        //     i++;
        // }

        int i = 0;
        while (i < 10) {
            System.out.println("game # " + (i + 1));
            System.out.println("choose 'rock', 'paper' or 'scisor'");
            game.singleGame(sc.next());
            i++;
        }
        
        // GAME OVER

        // if (a >= 10 && b < 5) {
        // System.out.println("В диапазоне");
        // }

        // System.out.println(a >= 10 && b < 5);

        // if (a == 10 || b > 15) {
        // System.out.println(a >= 10 || b < 5);
        // } else {
        // System.out.println(a >= 10 || b < 5);
        // }

        // if (a > 10) {
        // System.out.println("a >10");
        // } else if (b < 5) {
        // System.out.println("b<5");
        // } else if (a < 3) {
        // System.out.println("a<3");
        // }

        // switch (a) {
        // case 5:
        // System.out.println("a = 5 sw");
        // break;
        // case 6:
        // System.out.println("a = 6 sw");
        // break;
        // case 7:
        // System.out.println("a = 7 sw");
        // break;

        // default:
        // System.out.println("нет значения свитч");
        // }

    }
}
