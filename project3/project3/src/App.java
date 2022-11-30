import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Car car = new Car(20000, 220, "toyota ", (short) 5);
        car.printOut();
        System.out.println(car.print());

        String str = car.print();
        str = str + " add some string";
        System.out.println(str);

        int a = 55;
       
        System.out.println("Enter int");
        a = scanner.nextInt();
        System.out.println("typed : " + a);

        double d = 2;
        System.out.println("Enter double");
        d = scanner.nextDouble();
        System.out.println("typed : " + d);

        char c = 2;
        System.out.println("Enter char");
        c = scanner.next().charAt(0);
        System.out.println("typed : " + c);

        String st;
        System.out.println("Vvedite znachenie tipa String");
        st = scanner.nextLine();
        System.out.println("Vi vveli: " + st);


        System.out.println(suma());
    }

    static void printInt(){
        System.out.println("enter ");
        int a = scanner.nextInt();
        System.out.println(a);

    }

    public static int suma(){
        System.out.println("enter first num");
        int a = scanner.nextInt();
        System.out.println("enter second num");
        int b = scanner.nextInt();
        return a+b;
    }

}
