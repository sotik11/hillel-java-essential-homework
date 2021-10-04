package essential.java.hillel.sotik.home_work_2.langtons_ant;

import java.util.Random;
import java.util.Scanner;

public class LangtonsAnt {
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new LangtonsAnt().game();
    }
    LangtonsAnt(){
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }

    void game(){
        initTable();
        printTable();
    }



    void initTable() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
//                table[row][col] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        System.out.println("");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                System.out.print(table[row][col] + " ");
            System.out.println();
        }
    }

    }

