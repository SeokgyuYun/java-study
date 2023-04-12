package kr.hs.dgsw.java.scanner;

import java.util.Scanner;

public class Calculator {
    int add(int value1, int value2) {
        return value1 + value2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int value1 = sc.nextInt();
        int value2 = sc.nextInt();

        int result = calculator.add(value1, value2);

        System.out.printf("%d + %d = %d", value1, value2, result);
        sc.close();
    }
}
