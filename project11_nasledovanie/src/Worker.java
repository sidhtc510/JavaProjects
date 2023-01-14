   // Наследуюсь от класса Human
public class Worker extends Human{

    private double wage;
    private String position;

    public Worker(String name, int age, String position, double wage) {         // Создаю конструктор, который ссылается на конструктор родителя
        super(name, age);   // Сама ссылка
        this.position = position;
        this.wage = wage;
    }

       public double getWage() {
           return wage;
       }

       public void setWage(double wage) {
           this.wage = wage;
       }

       public String getPosition() {
           return position;
       }

       public void setPosition(String position) {
           this.position = position;
       }

       @Override             // Метод для демонстрации переопределения
       public void printClass() {
           System.out.println("Сделан из класса Worker");
       }



       @Override
       public String toString() {
           return "Worker{" +
                   "name=" + getName() +
                   ", age=" + super.getAge() +
                   ", wage=" + wage +
                   ", position='" + position + '\'' +
                   '}';
       }
   }
