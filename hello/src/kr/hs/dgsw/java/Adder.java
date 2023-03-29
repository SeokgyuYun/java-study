package kr.hs.dgsw.java;

public class Adder {
    int add(int operand1, int operand2) {
        return operand1 + operand2;
    }

    int add(int operand1, int operand2, int operand3) {
        return add(add(operand1, operand2), operand3);
    }

    public static void main(String[] args) {
        Adder adder = new Adder();

        int sum = adder.add(1239487, 1234890);
        System.out.println(sum);

        int sum2 = adder.add(1234324, 123412341, 123412345);
        System.out.println(sum2);
    }
}
