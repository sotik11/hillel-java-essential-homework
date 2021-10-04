package essential.java.hillel.sotik.home_work_1;

import java.util.Scanner;

public class EnvironmentApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите системную переменную: ");
        String environment = System.getenv(scanner.next());
        if (environment == null) {
            System.out.println("Вы ввели не верную системную переменную.");
        } else {
            System.out.println("Значение введенной переменной: " + environment);
        }
    }
}
