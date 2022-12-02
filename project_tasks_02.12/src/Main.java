import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      minim();
    }

    static public void minim(){
        System.out.println("enter num 1");
        int a = scanner.nextInt();
        System.out.println("enter num 2");
        int b = scanner.nextInt();
        System.out.println("enter num 3");
        int c = scanner.nextInt();
       int min;
        if (a < b){
            min = a;
            
            System.out.println(a);
        }else{
            min = b;
            System.out.println(b);
        }
        
        if (min > c){
            min = c;
        }
    }
}
