public class Main {

    /*
    1) Приведение типов
    2) Типы данных
    3) String
    4) Переполнение типа
    5) Разбор вопросов
     */

    /*
    Теория
    Приведение типов - преобразование одного типа данных в другой.
    АТД(абстрактный тип данных) - данные обладающие определенной характеристикой(int, double, String, Car(свой тип данных),
    Human(свой тип данных) и т.д.);
    Для приведения типа необходимо указать тип, к которому приводим в скобочках перед приводимым типом, например:
    int i = (int)12.4;

    Существует явное и неявное приведение:
    Явное приведение - требует участия программиста, выше показан пример явного приведения
    Неявное приведение делает автоматически системой

    Переполнение типа - помещение в переменную значения превышающего память этой переменной, в Java справоцирует выход
    за границы числа - получится ситуация: сложили 2 положительных числа, на выходе отрицательное.

    String - ссылочный тип данных(массив символов). В отличие от примитивных типов поставляет огромное количество методов
    для работы со своими переменными.


     */

    /*
    Заметки
    Приведение ссылочных типов тоже возможно:
    Car car = (Car)human; // Пример выдуманный, на практике вряд ли нужно будет приводить человека к автомобилю, но порой
    приведение ссылочных типов выглядит крайне не очевидным, поэтому советую запомнить именно этот пример
    Также следует добавить, что при приведении ссылочных типов следует учитывать их логическую связь.

    Для определения типа данных существует метод getClass();

    Для String в Java перегружен оператор +.
    Сложение строк называется конкатенацией
    += - оператор, позволяющий складывать значения
    String периодически называют "Стрингой" - профессиональный сленг
    По умолчанию примитивные типы равны 0
    Для перехода к источнику кода нужно зажать ctrl и мышью нажать на класс
     */

    public static void main(String[] args) {
        int a;                // Декларация переменных
        double d;

        d = 15.7;           // Инициализация переменных
        a = (int)d;         // Приводим double к int

        System.out.println(a);

        a = 17;                 // Пример неявного приведения типов
        d = a;

        System.out.println(d);

        char s;
        int t;

        t = 325;

        s = (char)t;  // Явное приведение

        System.out.println(s);

        s = '$';

        t = s;    //Неявное приведение

        System.out.println(t);

        int i = 2000000000 + 1000000000;      // Переполнение типа.
        int e = 2000000000;
        int y = 1000000000;
        i = e+y;
        System.out.println(i);

        long l = (long)e+(long)y;       // Необходимо явно привести типы данных int к long

        System.out.println(l);

        String str;

        str = "" + i;

        System.out.println(str);

        System.out.println(str.getClass());    // Определение типа данных.

        System.out.println();

        str = "";                          // Обнуляем переменную типа String

        str = "Привет";                 // Присваиваем значение переменной String

        str += " Пока";                 // Способы объеденинения переменных

        System.out.println(str);

        str = str + " Я очень далека";

        System.out.println(str);

        // Управление строками возможно при помощи специальных методов



        System.out.println(str.toUpperCase());  // Перевод всех букв в верхний регистр

        System.out.println(str.toLowerCase());  // Перевод всех букв в нижний регистр

        str = "  " + str + "  ";

        System.out.println(str);


        System.out.println(str.trim());       // Убираем пробелы вначале и конце

        System.out.println(str.length());   // Длина строки

        String subStr = str.substring(8);  // Выводим подстроку с указанног индекса

        System.out.println(subStr);

        subStr = str.substring(8, 13) ;  // Выводим подстроку из указанного диапазона

        System.out.println(subStr);

        System.out.println(str.charAt(14));   // Получаем символ по его позиции в строке

        for (int j = 0; j < str.length(); j++ ){     // Для тех кто знает циклы показываю разбор строки на символы.
            System.out.println(str.charAt(j));
        }

        for (int j = 0; j < str.length(); j++ ){     // Для тех кто знает циклы показываю разбор строки на символы.
            if(str.charAt(j) == 'Я' || str.charAt(j) == 'я' ){   // Для тех кто знаком с условными операторы
                System.out.println(str.charAt(j));
            }
        }



        System.out.println(str.replace('Я', 'я'));     // Заменили символ
        System.out.println(str.replace('а', ' '));

        Car car = new Car(3);           // Иллюстрация работы с методами

        car.printA();

        car.printAB();

        System.out.println(car.sum());

        myMethod();
    }

    public static void myMethod() {
        System.out.println("some logick");
    }

    /*
    1) Работа со String
    2) Продемонстировать явное и неявное приведение типов
    3) Показать переполнение
    4*) Показать работу с методами и *классами
    5**) Сделать реверс строки
     */
}
