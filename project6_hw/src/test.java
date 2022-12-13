public class test {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five"};
        printReverseArr(arr);
    }

    private static void printReverseArr(String[] arr) {
        for (int i =  arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
