package essential.java.hillel.sotik.home_work_1;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter math action: ");
        int a = scanner.nextInt();
        String act = scanner.next();
        int b = scanner.nextInt();
        int summ = 0;
        if (act.equals("plus") || act.equals("+")) {
            summ = (a + b);
            act = "+";
        }
        if (act.equals("minus") || act.equals("-")) {
            summ = (a - b);
            act = "-";
        }
        if (act.equals("divide") || act.equals("/")) {
            summ = (a / b);
            act = "/";
        }
        if (act.equals("multiply") || act.equals("*")) {
            summ = (a * b);
            act = "*";
        }
        if (a == 0 && act.equals("/") || (b == 0 && act.equals("/"))) {
            System.err.println("Cannot divide by zero!");
        } else {
            System.out.println("Result: " + a + " " + act + " " + b + " = " + summ);
        }
    }
}