package kr.hs.dgsw.java.inherit.calculator;

public class Substractor extends SimpleCalculator{
    @Override
    public int calculate() {
        return op1 - op2;
    }

    @Override
    public String getOperator() {
        return "-";
    }

    public static void main(String[] args) {
        SimpleCalculator substractor = new Substractor();
        substractor.execute();
    }
}
