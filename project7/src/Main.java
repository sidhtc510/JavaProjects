public class Main {
    // Поля класса - переменные. которые видны во всем классе

    static int[] arr = new int[15];   // Глобальный массив, будет виден во всем классе

    static int[] sub;                 // Подмассив, в котором будут храниться числа кратные трем, его размер вычислим динамически

    static int count;                 // Переменная, которая будет определять размер массива

    /*
    Задача 1
    Есть массив, нужно определить все его элементы, кратные 3, выписать их в отдельный массив и найти среднее арифметическое
    его элементов.
     */

    /*
    Решение
    1) Создать массив и заполнить его
    2) Создать необходимые переменные
    3) Создать метод, который заполнит вспомогательный массив
    4) Создать метод, который найдет среднее арифметическое
     */

    /*
    Заметки
    геттер дает возможность получить значение переменной
    сеттер дает возможность изменить ее значение
     */

    static Utils utils;

    public static void main(String[] args) {

        int[] a = new int[10];             // Локальный массив, он будет виден только в методе, в котором определен

        for (int i = 0; i < a.length; i++) {   // Заполняю массив значениями индексов)  (цикл)
            a[i] = i;
            System.out.print(a[i] + " "); // Выводим массив
        }

        System.out.println(); // Переходим на новую строку

        fillArray(a);                        // Вызываю метод для заполнения подмассива

        System.out.println(average());      // Вызываю метод для расчета среднего арифметического

        System.out.println("Работаем из отдельного класса через объект: ");
        utils = new Utils(a);   // Создаю объект и передаю массив

         utils.arrayOut();     // Вызываю метод объекта

        utils.defineLength();  // Определяю длину массива

        utils.fillArray(); // Заполняю массив

        System.out.println(utils.average()); // Вывожу среднее арифметическое

        int[] b = utils.getSub(); // Получаю подмассив через геттер


        System.out.println("Подмассив: ");
        for (int i = 0; i < b.length; i++) {   // Вывожу подмассив
            System.out.print(b[i] + " ");    // Вывод в строку
        }
        System.out.println();  // Переход на новую строку

        int[] c = {3, 4, 7, 10, 5, 8, 9 }; // Создаю новый массив
        utils.setSub(c);    // Передаю его в объект

        System.out.println("Среднее арифметическое добавленного массива: ");
        System.out.println(utils.average());  // Вывоже среднее значение элементов нового массива

        c = utils.sort(c);   // Сортирую массив

        System.out.println("Отсортированный массив: ");

        for (int i = 0; i < c.length; i++) {   // Вывожу отсортированный массив
            System.out.print(c[i] + " ");
        }

        System.out.println();
    }


     //Создаю метод, который будет определять размер подмассива и заполнять его требуемыми значениями
    public static void fillArray(int[] arr){ // Локальная переменная имеет более высокий приоритет, чем глобальная, поэтому в этом методе arr будет свой
        for (int i = 0; i < arr.length ; i++) {          // Цикл, который определяет какие
            if(arr[i] % 3 == 0 && arr[i] != 0){                           // Проверяем кратно ли число 3
                System.out.println("Элемент кратный 3: " + arr[ i]);
                count++;                                              // Увеличиваем счетчик
                System.out.println("Счетчик, определяющий размер подмассива: " + count);
            }
        }

        sub = new int[count];                   //Создаем массив, с определенным выше количеством элементов
        count = 0;
        for (int i = 0; i < arr.length; i++) {            // Проходим массив и добавляем числа кратные 3 в подмассив
            if(arr[i] % 3 == 0 && arr[i] != 0){                           // Проверяем кратно ли число 3 и равно ли оно нуля
              sub[count] = arr[i];                                 // Добавляем элемент
              System.out.println("Добавленный элемент: " + sub[count]);
              count++;                      // Увеличиваем индекс
            }
        }

    }
    // Метод, который находит среднее арифметическое значение
    public static double average(){
        double av = 0;          // Переменная, суммирующая элементы массива
        for (int i = 0; i < sub.length; i++) {
            av += sub[i];                    // Суммируем элементы
        }
        return av/ sub.length;        // Возвращаю среднее арифметическое - сумму элементов делю на их количество
    }

}