import java.util.Random;
import java.util.Scanner;

/*
    ДЗ
    1)Создать Scanner и организовать ввод чисел
    2) Проверить больше ли некоторого значения сумма двух чисел, если нет вывести сообщение что сумма меньше заданного значение
    3) Через case обработать несколько вариантов введенной переменной, предусмотреть дефолтный случай
    4) Инициализировать массив псевдослучайными числами(Random)
    5) Найти сумму и произведение всех элементов этого массива
    6) Сделать класс, который будет искать площадь треугольника, прямоугольника и окружности
     */

/*
    1) В классе Human добавить возможность изменения значений
    *
    2)Реализовать класс для работы с массивом типа double
    3) Реализовать класс для работы с массивом типа Human
    4) Реализовать стирание и удаление, показать разницу между ними
    5) Реализовать возможность игры человека с человеком в "Камень, ножницы, бумага"
    6) Предусмотреть оповещение о исчерпании выделенной памяти и недопущение выхода за границы массива
    7) Реализовать динамическое выделение памяти при ее завершении
    8) Предусмотреть корректный ввод данных в массив
    9) Реализовать сортировку массива
    10) Реализовать поиск в массиве индекса указанного элемента
     */

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Task 1
        // System.out.println(vvodChisel());

        // Task 2
        // sravniChisla();

        // Task 3
        // cherezCase();

        // Task 4 & Task 5
        // int arr[] = new int[3];
        // arr = randomArray();
        // printArray(arr);
        // sumProizved(arr);

        //Task 6
        Square sqr = new Square();
        System.out.println(sqr.pryamougolnik(6, 4));
        System.out.println(sqr.treugolnik(8, 12));
        System.out.println(sqr.krug(6));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int vvodChisel() {
        System.out.print("Enter num: ");
        int a = scanner.nextInt();
        return a;
    }

    public static void sravniChisla() {
        System.out.print("Введи число с которым будешь сравнивать: ");
        int compare = scanner.nextInt();
        System.out.print("Введи число первое ");
        int a = scanner.nextInt();
        System.out.print("Введи числовторое: ");
        int b = scanner.nextInt();

        if (a + b < compare) {
            System.out.println("сумма двух чисел '" + (a + b) + "' меньше чем заданное '" + compare + "'");
        } else if (a + b > compare) {
            System.out.println("сумма двух чисел '" + (a + b) + "' больше чем заданное '" + compare + "'");
        } else {
            System.out.println("сумма двух чисел '" + (a + b) + "' равно заданному '" + compare + "'");
        }

    }

    public static void cherezCase() {
        System.out.print("Введи число ");
        int a = scanner.nextInt();
        switch (a) {
            case 5:
                System.out.println("Введенное число равно 5-ти");
                break;
            case 6:
                System.out.println("Введенное число равно 6-ти");
                break;
            case 7:
                System.out.println("Введенное число равно 7-ти");
                break;

            default:
                System.out.println("Введенное число не равно 5, 6, либо 7");
                break;
        }
    }

    public static int[] randomArray() {
        int[] a = new int[3];
        Random rand = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10);
        }
        return a;
    }

    public static void sumProizved(int[] myArray) {
        int sum = 0;
        int proizv = 1;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        for (int i = 0; i < myArray.length; i++) {
            proizv *= myArray[i];
        }
        System.out.println(sum);
        System.out.println(proizv);
    }

}
