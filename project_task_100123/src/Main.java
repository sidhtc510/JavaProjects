public class Main {
    public static void main(String[] args) throws Exception {
     
    }  //С чем используются модификаторы доступа
    //1. С методами: public static void main(String[] args)
    //2. С классами: public class Main
    //3. С конструкторами: public Main(String name)
    //4. С полями класса: private Sting name
    //5. С интерфейсами public interface Serializable
    //6. С enum public enum Days

    //С чем НЕЛЬЗЯ использовать модификаторы доступа
    //1. С блоками инициализации
    //2. С локальными переменными
    //3. С аргументами методов

    //1. public: доступно везде (в любом классе, в любом пакете, в любой части кода)
    //2. нет модификатора: доступно в пределах одного и того же пакета
    //3. protected: доступно внутри самого класса и всех классов, наследующих данный
    //4. private: доступно только внутри самого класса
}
