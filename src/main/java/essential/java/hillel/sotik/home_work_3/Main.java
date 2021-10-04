package essential.java.hillel.sotik.home_work_3;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        String message = "Hello, world!";
        print(n, message);
    }

    static void print(String message) {
        System.out.println(message);
    }

    static void print(int n, String message) {
        int counter = 0;
        while (counter < n) {
            System.out.println(message);
            counter++;
        }
    }
}