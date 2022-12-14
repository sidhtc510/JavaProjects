import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
    План занятия
    1) Закрепление материала
    2) Знакомство с объектами и наследованием
     */

    /*
    Теория
    Наследование - передача функционала от класса родителя классу потомку.
    Чтобы унаследоваться от класса, нужно указать слово extends(расширение), например,
    public class Child extends Parent - класс Child наследуется от класса Parent
    Важный момент: наследование применяется в Java на системном уровне - любой класс в Java неявно наследуется от класса
    Object.
    Object - это базовый класс Java(общий предок для всех классов). Такой подход гарантирует наличие определенного
    функционала у каждого класса.
    Методы:
    toString()  - выводит все поля класса в строке
    equals()    - Проверяет равенство объектов
    hashCode()  - Математическое значение полей объекта
    clone()     - Безопасное(глубокое) копирование

    super - ссылка на класс родитель. super() - вызов конструктора родителя, super.название метода - вызов метода
    родителя

    Наследование обеспечивает класс определенными методами, которые при желании можно переопределить, т.е. указать свою
    реализацию.

    @Override - аннотация, которая указывает на то, что метод был переопределен.

     */

    /*
    Заметки
    Аннотации бывают разные, некоторые могут оказывать влияние на работу приложения.
     */

    /*
    Задача
    Унаследоваться от класса Worker и создать классы: Manager и Teacher
    null - пустая ссылка
     */

    static Manager manager = new Manager("Vanya", 23, "Manager", 4000, "top");     // Создаю глобальную переменную

    public static void main(String[] args) {

        Human human = new Human("Valeria", 23);

        Worker worker = new Worker("Dima", 35, "Manager", 3500);

        Student student = new Student("Vasya", 20, 3, "Tasks *");

        System.out.println(human.getName() + " " + human.getAge());

        System.out.println(worker.getName() + " " + worker.getAge() + " " + worker.getPosition() + " " + worker.getWage()) ;

        System.out.println(student.getName() + " " + student.getAge() + " " + student.getCourse() + " " + student.getHomeWork());

        System.out.println(human);

        human.printClass();      // Вызываем метод, который определили в классе Human и который должен указывать из какого класса сделан объект
        worker.printClass();
        student.printClass();



        System.out.println(worker);
        System.out.println(student);

        student.setName("Masha");
        System.out.println("Дух времени: ");
        System.out.println(student);

        Human[] arr = new Human[10];       // Создаем массив типа Human
        arr[0] = new Human("Vlad", 24);
        arr[1] = human;
        arr[2] = new Human("Sveta", 25);

        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
        }

        Scanner scanner = new Scanner(System.in);
                                           //Ваня Маша Дима
        String str = scanner.next();
        String[] arr1 = str.split(" ");  // Пример разделения строки по условию. Вверху сама строка, делим по пробелу

        Random random = new Random();        // Пример генерации случайных строк(имен)
        for (int i = 0; i < 10; i++) {
            String[] strArr = {"Masha", "Vanya", "Lena"};
            int r = random.nextInt(3);
            String name = strArr[r];
            System.out.println("Имя: " + name);
        }





    }

    /*
    1*) Класс для знакомств(Реализация ограничивается только фантазией)

     */
}
