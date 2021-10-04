package essential.java.hillel.sotik.home_work_8;

import java.util.Arrays;
import java.util.Random;

public class sumOfArrayElements {
    public static void main(String[] args) {
        Random rd = new Random();
        int randomNumber = rd.nextInt(1000) + 1;
        int arrLength = rd.nextInt(10) + 1;
        int[] array = new int[arrLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100) + 1;
        }
        System.out.println("\nRandom array are: " + Arrays.toString(array));
        System.out.println("Sum of all array elements are: " + sumOfArray(array, array.length - 1) + "\n-----------------------------------");

        System.out.println("\nRandom array are: " + Arrays.toString(array));
        System.out.println("The max value of array elements are: " + maxValue(array, 0) + "\n-----------------------------------");

        System.out.println("\nRandom number is: " + randomNumber);
        System.out.println("Sum of all number elements are: " + sumOfNumber(randomNumber) + "\n-----------------------------------");

        System.out.println("\nRandom number is: " + randomNumber);
        System.out.print("The new (reverse) number is: ");
        reversNumber(randomNumber);
        System.out.println();
    }

    public static int sumOfArray(int[] array, int arrLength) {
        if (arrLength == 0) {
            return array[0];
        } else {
            return array[arrLength] + sumOfArray(array, arrLength - 1);
        }
    }

    public static int maxValue(int[] array, int max) {
        if (array.length > max) {
            int next = maxValue(array, max + 1);
//            return Math.max(array[max], next);
            return (array[max] > next) ? array[max] : next;
        } else {
            return array[0];
        }
    }

    public static int sumOfNumber(int randomNumber) {
        if (randomNumber / 10 >= 1) {
            int temp = randomNumber % 10;
            int remain = randomNumber / 10;
            return temp + sumOfNumber(remain);
        } else {
            return randomNumber;
        }
    }

    public static void reversNumber(int randomNumber) {
        if (randomNumber < 10) {
            System.out.println(randomNumber);
            return;
        } else {
            System.out.print(randomNumber % 10);
            reversNumber(randomNumber / 10);
        }
    }
}
