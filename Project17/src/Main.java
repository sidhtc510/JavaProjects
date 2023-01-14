public class Main {
    public static void main(String[] args) {

        
        Calculator calculator = new Calculator();
        double result = calculator.add(2, 3);
        System.out.println(result); // 5

        result = calculator.subtract(5, 2);
        System.out.println(result); // 3

        result = calculator.multiply(3, 4);
        System.out.println(result); // 12

        result = calculator.divide(10, 0);
        System.out.println(result); // 5

        result = calculator.exponentiation(5,3);
        System.out.println(result); // 125

    }
}