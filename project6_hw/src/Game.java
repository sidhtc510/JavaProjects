import java.util.Random;

public class Game {
    Random random = new Random();

    public void singleGame(String sc){
        int a = random.nextInt(3) + 1;
        String str1 = " ";
        String str2 = " ";
        if (a == 1) {
            str1 = "paper";
        } else if (a == 2) {
            str1 = "rock";
        } else if (a == 3) {
            str1 = "scisor";
        }

        str2 = sc;
        System.out.println("player 1 choose " + str1.toUpperCase());
        System.out.println("player 2 choose " + str2.toUpperCase());
        System.out.println(rsp(str1, str2));
    }

    public void randomGame() {
        int a = random.nextInt(3) + 1;
        int b = random.nextInt(3) + 1;
        String str1 = " ";
        String str2 = " ";
        if (a == 1) {
            str1 = "paper";
        } else if (a == 2) {
            str1 = "rock";
        } else if (a == 3) {
            str1 = "scisor";
        }

        if (b == 1) {
            str2 = "paper";
        } else if (b == 2) {
            str2 = "rock";
        } else if (b == 3) {
            str2 = "scisor";
        }
        System.out.println("player 1 choose " + str1.toUpperCase());
        System.out.println("player 2 choose " + str2.toUpperCase());
        System.out.println(rsp(str1, str2));
    }

    public String rsp(String str1, String str2) {
        if (str1.equals("scisor") && str2.equals("paper")){
            return "player 1 WIN!\n";
        } else if (str1.equals("scisor") && str2.equals("rock")) {
            return "player 2 WIN!\n";
        }

        if (str1.equals("rock") && str2.equals("paper")) {
            return "player 2 WIN!\n";
        } else if (str1.equals("rock" )&& str2.equals("scisor")) {
            return "player 1 WIN!\n";
        }

        if (str1.equals("paper") && str2.equals("rock")) {
            return "player 1 WIN!\n";
        } else if (str1.equals("paper") && str2.equals("scisor") ){
            return "player 2 WIN!\n";
        }

        else
            return "nobody win (Draw)\n";

    }

}