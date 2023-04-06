package kr.hs.dgsw.java.task;

import java.util.Scanner;

public class Factorial {
    int fac(int n) {
        if (n <= 1) return n;
        return fac(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial fac = new Factorial();
        System.out.println(fac.fac(sc.nextInt()));
        sc.close();
    }
}
