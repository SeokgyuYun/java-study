package kr.hs.dgsw.java.inherit;

public class Subtracter extends Adder {
    @Override
    public int calculate() {
        return op1 - op2;
    }
}
