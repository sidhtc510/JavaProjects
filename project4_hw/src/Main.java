/*
1) Работа со String
2) Продемонстировать явное и неявное приведение типов
3) Показать переполнение
4*) Показать работу с методами и *классами
5**) Сделать реверс строки
 */

public class Main {
    public static void main(String[] args) {
        // task1
        String str1;
        String str2;
        str1 = "hello@mail";
        str2 = ".ua";
        System.out.println(str1.length());
        System.out.println(str1.concat(str2));
        String str = str1 + str2; // no difference with the previous method
        System.out.println(str);
        System.out.println(String.join("#####", str1, str2));
        // System.out.println(str1.compareTo(str2)); // perhaps, method for working with
        // integer
        System.out.println(str1.charAt(1));
        System.out.println(str1.substring(3, 6));
        System.out.println(str1.replace("h", "H"));

        Book book = new Book(str1);
        System.out.println(book.titleBook);
        System.out.println(book.getClass());

        // task2
        int i = 1; // явное приведение
        float f = 15f;
        f = i;// неявное приведение
        System.out.println(f);

        // task3
        int var_int = 2000000000; // -2,147,483,648 to 2,147,483,647
        long var_long = 1000000000000L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        short var_short = 32767; // -32,768 to 32,767
        byte var_byte = 127; // -128 to 127

        System.out.println(var_int + 147483648); // переполнение работает
        System.out.println(var_byte + 147483648); // с байт и шорт переполнение не работает. более того, показывает
                                                  // разный результат
        System.out.println(var_short + 147483648); // с байт и шорт переполнение не работает. более того, показывает
                                                   // разный результат

        // task 4 (call functions)
        int x = 15;
        int y = 115;
        myProcedure();
        myProcedureWithArg(x, y);
        System.out.println(myFunc());
        System.out.println(myFuncWithArg(x, y));
        System.out.println(myFuncString());
        System.out.println(myFuncStringWithArg(str1, str2));

        // task5 (call function)
        System.out.println(reverseString(str1));
    }

    // task4 (Functions declaration)
    public static void myProcedure() {
        System.out.println(1 + 1);
    }

    public static void myProcedureWithArg(int a, int b) {
        System.out.println(a + b);
    }

    public static int myFunc() {
        return 1 + 1;
    }

    public static int myFuncWithArg(int a, int b) {
        return a + b;
    }

    public static String myFuncString() {
        return "hello";
    }

    public static String myFuncStringWithArg(String a, String b) {
        return ("hello" + a + b);
    }

    // task 5 (стырял с интернета)
    public static String reverseString(String str) {                // объявляю ф-ию со стринг аргументом
        char ch[] = str.toCharArray();                                       // в массив чар добавляю по 1 символу ["h", "e", "l", "l", "o", ]
        String rev = "";                                                               // объявляю переменную стринг
        for (int i = ch.length - 1; i >= 0; i--) {                          // циклом вывожу элементы массива в обратном порядке
            rev += ch[i];                                                               // дописываю символ на каждой итерации
        }
        return rev;                                                                     // ретарн
    }
}
