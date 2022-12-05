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
        int var_int = 2147483647; // -2,147,483,648 to 2,147,483,647
        long var_long = 9223372036854775807L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        short var_short = 32; // -32,768 to 32,767
        byte var_byte = 127; // -128 to 127

        System.out.println(var_int + 1); // переполнение работает
        System.out.println(var_long + 1); // переполнение работает
        System.out.println(var_short + 1); // с шорт переполнение не работает.
        System.out.println(var_byte + 1); // с байт переполнение не работает.

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
        // task5
        for (int ix = str1.length() - 1; ix >= 0; ix--) {
            System.out.print(str1.charAt(ix));
        }

    }

    // task4 (Functions declaration)
    public static void myProcedure() { // процедура без арнументов
        System.out.println(1 + 1);
    }

    public static void myProcedureWithArg(int a, int b) {// процедура с аргументами
        System.out.println(a + b);
    }

    public static int myFunc() { // функция int без арнументов
        return 1 + 1;
    }

    public static int myFuncWithArg(int a, int b) {// функция int с аргументами
        return a + b;
    }

    public static String myFuncString() { // функция string без аргументов
        return "hello";
    }

    public static String myFuncStringWithArg(String a, String b) {// функция string с аргументами
        return ("hello" + a + b);
    }

    // task 5 (стырял с интернета)
    public static String reverseString(String str) { // объявляю ф-ию со стринг аргументом
        char ch[] = str.toCharArray(); // в массив чар добавляю по 1 символу ["h", "e", "l", "l", "o", ]
        String rev = ""; // объявляю переменную стринг
        for (int i = ch.length - 1; i >= 0; i--) { // циклом вывожу элементы массива в обратном порядке
            rev += ch[i]; // дописываю символ на каждой итерации
        }
        return rev; // ретарн
    }
}

// Task 5 ‹стырял у Сэйде
// public static String reverse(String str1) {
// return new StringBuilder(str1).reverse().toString();
// }