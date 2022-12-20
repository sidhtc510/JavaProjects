import java.util.Random;

public class Main_prepod {

    /*
    План занятия
    1) Работа с объектами
    2) Матрицы
    3) Наглядная теория
     */

    /*
    Теория
    Массивы могут иметь несколько измерений, на данном занятии мы познакомимся с двумерными массивами(матрицами).
    Чтобы создать массив с несколькими измерениями, необходимо их указать:
    int[][] mtx = new int[10][10];
    В матрице сначала указывается строка, затем столбец:
     //1 2 3 4 5 6  (строка 0)
    // 5 6 3 2 1 9  (строка 1)


     */

    /*
    Заметки
    Замедлить работу программы можно при помощи класса Thread и его метода sleep, чтобы он заработал нужно
    нажать alt+enter и выбрать  add exception to method signature:
    Thread.sleep(1000);   - будет зависать на секунду

     */

    static Random random = new Random();
    static int[][] mtx = new int[10][10];      // Создаю матрицу

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        for (int i =0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                mtx[i][j] = random.nextInt(10);         // Заполняю матрицу псевдослучайными числами
                System.out.print(mtx[i][j] + "  ");      // Вывожу их в строку
            }
            System.out.println();            // Переходим на новую строку

        }

        System.out.println("Новая матрица: ");

        Matrix matrix = new Matrix();
        int[][] m = matrix.createMatrix(10, 10);
        matrix.printMtx(m);
        matrix.findMaxes(m);
        matrix.findMinis(m);


        int a = 10;                         // Значения переменных равны
        int b = 10;

        Human h1 = new Human(22, "Vlada", 'f');   // Значения объектов равны
        Human h2 = new Human(22, "Vlada", 'f');

        System.out.print("Сравниваем одинаковые int: ");   // Значение примитивных типов можно сравнивать логически
        System.out.println(a == b);

        System.out.print("Сравниваем одинаковые human: "); // Значения ссылочных типов необходимо сравнить через переопределенный метод equals()
        System.out.println(h1.equals(h2));

        Human h3 = h1; // Небезопасное копирование(скопировал ссылку)

        System.out.println(h1);
        System.out.println(h3);

        h3.setSex('m');            // Пол поменяется для обоих объектов

        System.out.println(h1);
        System.out.println(h3);

        Human h4 = (Human) h2.clone();

        System.out.println(h2);
        System.out.println(h4);

        h2.setAge(23);

        System.out.println(h2);
        System.out.println(h4);

    }

    /*
    1) Вывести крестик и ДНК
    2) Копирование объектов: Безопасное и небезопасное
    3) Сравнение объектов логическое и через метод equals
    4) Покрасить максимальный элемент строки в матрице красным цветом, минимальный синим
    5) Сортировка матрицы
    6) Посчитать сумму элементов арифметической и геометрической прогрессии
    7) Парадокс Монти Холла. Задача:
    Игра
    Есть 3 двери. За двумя расположены козы, за одной автомобиль, если выбрать дверь с автомобилем, Вы его выигрываете
    Вы сделали выбор и ведущий открывает дверь с козой, но не ту, которую Вы выбрали, потом предлагает изменить свой выбор.
    Есть ли выгода принять его предложение?
     */
}