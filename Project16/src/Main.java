import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
    Задача
    Реализовать лотерею
     */

    /*
    Заметки
    Если код зачеркивается, это означает, что данный способ помечен как deprecated, т.е. разработчики языка не рекомендуют
    так писать по какой-либо причине, но код будет работать
     */

    static Random random = new Random();
    static int[] lottery = new int[5]; // Создали массив

    static Scanner scanner = new Scanner(System.in);
    static int[] bet  = new int[5];

    static JFrame jFrame;

    public static void main(String[] args) throws InterruptedException {   // throws нужен для задержки, пока на него не обращаем внимание

        jFrame = new JFrame();







        while (true) {

            createLottery();     // Создаю набор чисел для лотереи

            makeBet();        // Спрашиваю ставку игрока

            betOut();         // Вывожу ставку игрока

            lotteryOut();       // Вывожу значение лотереи

            checkBet();        // Проверяю совпадения  по позиции

            checkNumbers();   // Проверяем сколько чисел угадали

        }
    }
         // 2 3 3 4 5
         // 1 2 3 4 5
    public static void checkNumbers(){       // Проверяем сколько чисел угадали
        int count = 0;                        // Счетчик
        ArrayList<Integer> checkedPositions = new ArrayList<>(); // Создаю динамически расширяющуюся структуру - массив
        for (int i = 0; i < bet.length; i++) {      // Два цикла, чтобы проверить каждое число с каждым
            for (int j = 0; j < lottery.length; j++) {
                    if(bet[i] == lottery[j] && !checkedPositions.contains(j)){      // Проверяем совпадение и не учитывали ли мы уже эту позицию
                        count++;            // Увеличиваем счетчик
                        checkedPositions.add(j); // Запоминаю учтенную позицию
                        break;        // Прекращаем исполнение цикла, чтобы одно число не выиграло 2 раза
                    }
            }
        }

        System.out.println("Вы угадали: " + count + " чисел");
    }

    public static void checkBet(){      // Проверяем ставку
        int count = 0;                  // Счетчик совпадений
        for (int i = 0; i < bet.length; i++) {    // Проходим по массивам
             if(bet[i] == lottery[i]){           // Проверяем совпадение
                 count++;                     // Увеличиваем счетчик
             }
        }
        System.out.println("Вы угадали по позиции: " + count + " цифры");    // Выводим результат
    }

    public static void makeBet(){
        for (int i = 0; i < bet.length; i++) {
            bet[i] = Integer.parseInt(JOptionPane.showInputDialog(jFrame, "Enter your message"));
            JOptionPane.showMessageDialog(jFrame, "Вы ввели: " + bet[i]);
        }
    }

//    public static void makeBet(){            // Делаем ставку
//        for (int i = 0; i < bet.length; i++) {
//            System.out.println("Введите ставку: ");
//            bet[i] = scanner.nextInt();     // Вводим ставку
//        }
//    }

    public static void betOut(){               // Выводим ставку
        System.out.println("Ваша cтавка:");
        for (int i = 0; i < bet.length; i++) {
            System.out.print(bet[i] + " ");       // Выводи в горизонтальную строку
        }
        System.out.println();                          // Переход на новую строку
    }



    public static void createLottery(){                  // Создаем лотерею
        for (int i = 0; i < lottery.length; i++) {    // Перебираем массив и заполняем его случайными числами
            lottery[i] = random.nextInt(5)+ 1;  // Само заполнение
        }
    }

    public static void lotteryOut() throws InterruptedException {        // Создаю метод, который будет с задержкой выводить номера. throws нужен для задержки, пока на него не обращаем внимание
        System.out.println("Значение лотереи: ");
        for (int i = 0; i < lottery.length; i++) {             // Перебираем массив
             System.out.print(lottery[i] + " ");         // Выводим в горизонтальную строку сгенерированные числа
             Thread.sleep(1000);              // Делаем задержку одну секунду
        }
        System.out.println();     // Переход на новую строку, после вывода всей комбинации
    }
}