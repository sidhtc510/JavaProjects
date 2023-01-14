public class Calculator {

    // Метод для сложения
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для вычитания
    public int subtract(int a, int b) {
        return a - b;
    }

    // Метод для умножения
    public int multiply(int a, int b) {
        return a * b;
    }

    public int primer(int a, int b, int c) {
        return a + b * c;
    }

    // Метод для деления
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: division by zero");
            return 0;
        }
        return a / b;
    }

    // метод для возведения в степень
    public double exponentiation(int a, int b) {
        return Math.pow(a,b);
    }
}