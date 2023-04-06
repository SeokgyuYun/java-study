package kr.hs.dgsw.java.task;

import java.util.Scanner;

public class MultiplicationTable {
    void printDan(int num) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultiplicationTable mt = new MultiplicationTable();
        mt.printDan(sc.nextInt());
        sc.close();
    }
}
