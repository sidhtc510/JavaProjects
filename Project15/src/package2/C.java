package package2;

import package1.A;

public class C extends A {
    private A aObj = new A(1, 2, 3, 4);

    public C(int a, int b, int c, int d) {
        super(a, b, c, d);

        System.out.println(aObj.a);
        // System.out.println(aObj.b);
        System.out.println(super.c); // так получаем доступ к модификатору протектед
    }

    private void print() {
        super.printC();
    }
}
