package kr.hs.dgsw.java.inherit.calculator;

import kr.hs.dgsw.java.scanner.Calculator;

public class Adder extends SimpleCalculator {
    @Override
    public int calculate() {
        return op1 + op2;
    }

    @Override
    public String getOperator() {
        return "+";
    }

    public static void main(String[] args) {
        SimpleCalculator adder = new Adder();
        adder.execute();
    }
}
