package kr.hs.dgsw.java.task;

import java.util.Scanner;

public class PerfectNumber {
    boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PerfectNumber pn = new PerfectNumber();
        System.out.println(pn.isPerfectNumber(sc.nextInt()));
        sc.close();
    }
}
