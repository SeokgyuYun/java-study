package kr.hs.dgsw.java.inherit.calculator;

import java.util.Scanner;

public abstract class SimpleCalculator {
    protected int op1;
    protected int op2;

    protected final Scanner sc = new Scanner(System.in);

    public void execute() {
        while (true) {
            inputOperands();

            if (op1 == 0 && op2 == 0) {
                break;
            }
            int result = calculate();
            printResult(result);
        }

        sc.close();
        System.out.println("프로그램이 종료합니다.");
    }

    public void inputOperands() {
        System.out.println("두 개의 정수를 입력하세요.");
        op1 = sc.nextInt();
        op2 = sc.nextInt();
    }

    public abstract int calculate();

    public void printResult(int result) {
        System.out.printf("%d %s %d = %d\n", op1, getOperator(), op2, result);
    }

    public abstract String getOperator();
}
