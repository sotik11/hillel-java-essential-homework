package essential.java.hillel.sotik.home_work_1;

import java.util.Scanner;

public class Summator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int summ = (a + b);
        System.out.println("Result: " + a + " + " + b + " = " + summ);
    }
}
