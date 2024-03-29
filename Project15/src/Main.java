import package2.C;

public class Main {

    /*
    План занятия
    1) Модификаторы доступа
    2) Практика
     */

    /*
    Теория
    Модификаторы доступа позволяют задать правила получения доступа к членам класса.
    В Java их 4: private, default(по умолчанию, примечание: иногда можно встретить обозначение как void или ------), protected, public
    private - Виден только в пределах класса, в котором определен
    ------(default) - Виден только в пределах пакета, в котором находится класс, в котором определен
    protected - Виден только в пределах пакета как и default плюс в классах потомках класса, в котором он определен
    public - Доступен везде.
    Примеры:
    private int a;
    int b; -  модификатор не указан (default)
    protected int c;
    public int d;

    Модификаторы доступа применяется не только для переменных, но и для методов и классов

    Модификаторы доступа позволяют задавать инкапсуляцию - один из трех основных принципов ООП


     */

    /*
    Заметки
    void ИНОГДА В ЛИТЕРАТУРЕ указывают для обозначения дефолтного уровня доступа к члену класса, но само слово
    в JAVA используется для указания типа метода(процедуры)
     */

    public static void main(String[] args) {
        C c = new C(0,0,0,0);
    }


}
