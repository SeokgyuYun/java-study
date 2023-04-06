package kr.hs.dgsw.java.task;

import java.util.Scanner;

public class LeastCommonMultiple {
    int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    int lcm(int a, int b) {
        return a*b / gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeastCommonMultiple lcm = new LeastCommonMultiple();
        System.out.println(lcm.lcm(sc.nextInt(), sc.nextInt()));
        sc.close();
    }
}
