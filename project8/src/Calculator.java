public class Calculator {
    public void startCalculation(char ch, double fd, double sd) {
        while (true) {
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == 'e') {
                switch (ch) {
                    case '+':
                        plus(fd, sd);
                        System.exit(0);
                        break; // почему брейк не отрабатывает- попадает в бесеонечный цикл
                    case '-':
                        minus(fd, sd);
                        System.exit(0);
                        break;
                    case '*':
                        multiply(fd, sd);
                        System.exit(0);
                        break;
                    case '/':
                        divide(fd, sd);
                        System.exit(0);
                        break;
                    case 'e':
                        System.exit(0);
                        break;
                }
            } else {
                System.out.println("Был введен неправильный знак +, -, *, /, e");
                System.exit(0);
            }
        }
    }

    private static void divide(double fd, double sd) {
        System.out.println("divide " + (fd / sd));
    }

    private static void multiply(double fd, double sd) {
        System.out.println("multiply " + (fd * sd));
    }

    private static void minus(double fd, double sd) {
        System.out.println("minus " + (fd - sd));
    }

    private static void plus(double fd, double sd) {
        System.out.println("plus " + (fd + sd));
    }
}
