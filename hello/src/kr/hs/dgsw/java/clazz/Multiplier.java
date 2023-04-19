package kr.hs.dgsw.java.clazz;

public class Multiplier {
    private int operand1;
    private int operand2;

    public void setOperand1(int operand) {
        this.operand1 = operand;
    }

    public void setOperand2(int operand) {
        this.operand2 = operand;
    }

    public void showResult() {
        // 표준 출력 장치로 3 * 4 = 12 라고 출력한다.
        int sum = 0;
        for (int i = 0; i < operand2; i++) {
            sum += operand1;
        }
        System.out.printf("%d * %d = %d", operand1, operand2, sum);
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        multiplier.setOperand1(5);
        multiplier.setOperand2(3);
        multiplier.showResult();
    }
}
