public class Human {

    private int age;              // Пример инкапсуляции: private - модификатор доступа. Указывает на то, что
    private String name;          // доступ к переменной возможен только в пределах класса
    private String surname;
    private String fathername;
    private char sex;

    public Human(int age, String name, String surname, String fathername) {    // Конструктор для старого паспорта
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
    }

    public Human(int age, String name, String surname) {      // Конструктор для нового паспорта
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public Human(int age, String name, String surname, String fathername, char sex) {   // Конструктор для паспорта с полом
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.sex = sex;
    }

    public Human(String name) {   // Конструктор с одним параметром
        this.name = name;
    }

    // Аксессоры. Указываем геттеры для доступа к переменным. Сеттеры не указываем - соблюдаем инкапсуляцию -
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFathername() {
        return fathername;
    }

    public char getSex() {
        return sex;
    }
}