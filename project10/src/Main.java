public class Main {

    /*
    План занятия
    1) Полиморфизм
    2) Практика
    3) Разбор вопросов
     */

    /*
    Теория
    Полиморфизм(с древнегреч. - многоформие) - один из 3 основных припципов объектно-ориентированного программирования(ООП)
    Заключается в том, что можно создавать методы с одинаковым названием, но разными параметрами, чтобы их можно было
    различать. Широкое применение имеет при создании конструкторов класса - часта один тип логически может требовать
    разные наборы параметров.
    Инкапсуляция("погружение в капсулу") - сокрытие переменных или методов в классе. Подразумевает добавление переменных
    или методов в классе с соблюдением определенного уровня доступа к ним.

     */

    /*
    Заметки
    Обратить внимание на полиморфизм при реализации домашней задачи с вычислением площади
    ' ' - символ(char)
    " " - строка(String)
    Конструктор - метод, который создает объект. Он должен совпадать с названием класса и он не имеет типа метода
     */



    public static void main(String[] args) throws InterruptedException {

        print(10);                      // Вызываем полиморфные методы
        print('s');


        // Используем полиморфизм
        Human oldPassport = new Human(25, "Havrylo", "Ivanov", "Nikolayevich");   // Старый паспорт

        Human newPassport = new Human(25, "Havrylo", "Ivanov");  // Новый паспорт

        System.out.println("Старый паспорт: " + oldPassport.getAge() + " " + oldPassport.getName() + " " +
                oldPassport.getSurname() + " " + oldPassport.getFathername());

        System.out.println("Новый паспорт: " + newPassport.getAge() + " " +newPassport.getName() + " " +
                newPassport.getSurname() );

        Human sexPassport = new Human(25, "Havrylo", "Ivanov", "Nikolayevich", 'm');

        Human singlePassport = new Human("Nadya");

        System.out.println("Паспорт с половой идентефикацией: " +sexPassport.getAge() + " " +sexPassport.getName() + " " +
                sexPassport.getSurname() + " " + sexPassport.getFathername() + " " + sexPassport.getSex() );

        System.out.println("Паспорт с одним параметром: " + singlePassport.getName());

        ArrayWorking arrayWorking = new ArrayWorking(5);       // Создаю объект для работы с массивом. 5 - размер массива
        arrayWorking.insert(7);                       // Вставляю элемент. 7 - вставляемый элемент
        arrayWorking.printArray();
        arrayWorking.insert(9);
        arrayWorking.printArray();
        arrayWorking.randomArray();  // Заполняю весь массив случайными числами
        arrayWorking.printArray();   // Вывожу массив
        arrayWorking.clearArray();
        System.out.println("Массив после удаления: ");
        arrayWorking.printArray();
//        arrayWorking.setCount();      Демонстрация разницы между стиранием и удалением
//        arrayWorking.printArray();

        ArrayWorking arrayWorkingChar = new ArrayWorking();
        System.out.println("Массив : ");
        arrayWorkingChar.insert('c');
        arrayWorkingChar.printArrayChar();
        arrayWorkingChar.insert('j');
        arrayWorkingChar.printArrayChar();

//        for (int i = 0; i < 10; i++) {    Пример с ожиданием программы
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
    }

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

    public static void print(int i){         // Создаем полиморфные методы
        System.out.println("int: " + i);

    }

    public static void print(char c){
        System.out.println("char: " + c);

    }
}