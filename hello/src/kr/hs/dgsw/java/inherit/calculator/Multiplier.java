package kr.hs.dgsw.java.inherit.calculator;

public class Multiplier extends SimpleCalculator {
    @Override
    public int calculate() {
        return op1 * op2;
    }

    @Override
    public String getOperator() {
        return "x";
    }

    public static void main(String[] args) {
        SimpleCalculator multiplier = new Multiplier();
        multiplier.execute();
    }
}
