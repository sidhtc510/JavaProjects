import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static StringBuilder stringBuilder = new StringBuilder();
    static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) {
        // Задача 1
        // int a;
        // while (true) {
        // a = scanner.nextInt(); // ДЗ *. Проверить введено ли число
        // String str;
        // // if(a >= 10){ Аналог тернарного оператора, далее запишем тоже, компактно
        // // str = "Правильно";
        // // }
        // // else {
        // // str = "Неправильно";
        // // }

        // // Инициализация Сравнение true false

        // str = a >= 10 ? "Правильно" : "Неправильно"; // Тернарный оператор.

        // System.out.println(str);

        // System.out.println("Выйти из цикла? y - да, n - нет"); // Условие выхода из
        // цикла

        // char c = scanner.next().charAt(0);

        // while (c != 'y' && c != 'n') { // Проверяем корректность ввода
        // System.out.println("Неправильный ввод");
        // System.out.println("Выйти из цикла? y - да, n - нет");
        // c = scanner.next().charAt(0);
        // }
        // if (c == 'y') {
        // break; // Прервать цикл
        // }
        // if (c == 'n') {
        // System.out.println("Выйти из цикла? y - да, n - нет");
        // continue; // Продолжить с новой итерации цикла

        // }

        // }
        // // Задача 2
        // System.out.println("enter num");
        // a = scanner.nextInt();
        // int b = a > 5 || a < 0 ? 5 : 1; // Работа с тернарным оператором для
        // присвоения значения int

        // System.out.println(b);

        stringBuilder.append("hello from stringBuilder");
        stringBuffer.append("hello from stringBuilder");
        System.out.println(stringBuilder);

        String str = stringBuilder.toString();
        stringBuilder.delete(2, 4);
        System.out.println(stringBuilder);


        
        // stringBuilder.deleteCharAt(4);
        // System.out.println(stringBuilder);

        // stringBuilder.insert(2,"!!!!!!!");
        // System.out.println(stringBuilder);

        // stringBuilder.replace(2,4, "stroka");
        // System.out.println(stringBuilder);

        // stringBuilder.reverse();
        // System.out.println(stringBuilder);

        // stringBuffer.substring(2, 7);
        System.out.println(stringBuffer.substring(2, 7));
    }
}
