import java.util.Random;

public class ArrayWorking {

    int[] arr;    // Массив, с которым будем работать
    char[] chArr;  // Массив, с которым будем работать другого типа
    int count;    // Указатель на границу уже добавленных элементов


    Random random = new Random();     // Создаю объект для генерации псевдослучайных чисел

    // Конструктор без типа метода
    public ArrayWorking(int size) {  // Выделяю память под массив
        arr = new int[size];
        count = 0;                 // Устанавливаем счетчик на нулевой элемент
    }

    public ArrayWorking(){       // Создаем пустой конструктор для массива типа char
        chArr = new char[10];
        count = 0;
    }

    public void insert(char value){
        chArr[count] = value;
        count++;
    }

    public void printArray(){
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");   // Выводим массив в строку через пробел
        }
        System.out.println("\nВывод массива закончен");          // Переходим на новую строку
    }

    public void printArrayChar(){
        for (int i = 0; i < count; i++) {
            System.out.print(chArr[i] + " ");   // Выводим массив в строку через пробел
        }
        System.out.println();          // Переходим на новую строку
    }



    public void insert(int value){   // Добавляем элемент в массив
        arr[count] = value;      // Само добавление
        count++;         // Увеличиваем счетчик
    }

    public void randomArray(){
         count = 0; // Обнуляю счетчик
        for (int i = 0; i < arr.length; i++){ // Перебираю весь массив
            arr[i] = random.nextInt(10);      // Присваиваю каждому элементы псевдослучайное число, в скобках указываю диапазон случайных чисел
            count++;               // Увеличиваю счетчик на 1 после каждого добавления элемента
        }
    }

    public void clearArray(){   // Удаление. Очистили массив
        System.out.println("Зашли");
        count = 0;
    }

//    public void clearArray(){   // Стирание - перезаписали память. Очистили массив
//        count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 0;
//        }
//    }

//    public void setCount(){    // Условно взломали программу и добавили функционал изменения счетчика, таким образом удаление
//        count = arr.length;   // стало неэффективным, чтобы защититься от такого приема, необходимо провести процедуру стирания-
//    }                         // - явной перезаписи памяти


}