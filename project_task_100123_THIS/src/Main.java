
public class Main {

    static ThisTest t = new ThisTest("Anatolii");

    public static void main(String[] args) throws Exception {

        System.out.println(t.getName(t));
        System.out.println(t.thisGetName());
        System.out.println(t.getNameHiddenThis());
    }

}
