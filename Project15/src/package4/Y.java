package package4;

import package3.X;

public class Y extends X {
    private X xObj = new X(1, 2, 3, 4);

    public Y(int a, int b, int c, int d) {
        super(a, b, c, d);

        System.out.println(xObj.a);
        // System.out.println(aObj.b);
        System.out.println(super.c); // так получаем доступ к модификатору протектед
    }
}
