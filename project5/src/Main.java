import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();

        if (c < 1 || c > 5) {
            System.out.println("no");
        } else {
            if (c == 5) {
                System.out.println("ok");
            } else if (c == 4) {
                System.out.println("good");
            } else if (c == 3) {
                System.out.println("blaa");
            } else {
                System.out.println("BAD");
            }
        }

        for (int i = 0; i < args.length; i++) {
            
        }

    }
}
