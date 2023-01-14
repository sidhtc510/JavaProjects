package package3;

public class X {
    public int a ;     // Модификаторы доступа для переменных
    int b;
    protected int c;
    private int d;

    public X(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

}
