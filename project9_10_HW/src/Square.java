public class Square {
    public int pryamougolnik(int a, int b) {
        return a * b;
    }

    public double treugolnik(double a, double b) {
        return 0.5 * a * b;
    }

    public double krug(double a) {
        // S= pi*r2
        double s;
        double pi = 3.14;
        s = pi * (a * a);
        return s;
    }
}
