import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      minim();
    }

    static public void minim(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
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
