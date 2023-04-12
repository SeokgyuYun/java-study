package kr.hs.dgsw.java.operation;

public class BitwiseStudy {
    void studyAnd() {
        int op1 = 5; // 101
        int op2 = 3; // 11

        int result = op1 & op2;

        System.out.printf("%d & %d = %d\n", op1, op2, result);
    }

    void studyOr() {
        int op1 = 0;
        int op2 = 017;

        int result = op1 | op2;

        System.out.printf("%d | %d = %d\n", op1, op2, result);
    }

    void studyXor() {
        int op1 = 0b1010;
        int op2 = 0b0011;

        int result = op1 ^ op2;

        System.out.printf("%d ^ %d = %d\n", op1, op2, result);
    }

    void studyNot() {
        byte value1 = (byte) 0b11110101;
        byte value2 = (byte) ~value1;

        System.out.printf("~%d = %02X\n", value1, value2);
    }

    void studyLeftShift() {
        byte value = 64;
        byte result;
        int count = 1;

        result = (byte) (value << count);
        System.out.printf("%02X << %d = %02X\n", value, count, result);
    }

    void studyRightShift() {
        byte value = -1;
        byte result;
        int count = 1;

//        result = (byte) (value >>> count);
        System.out.printf("%02X >> %d = %02X\n", value, count, value >> count);
        System.out.printf("%02X >>> %d = %02X\n", value, count, value >>> count);
    }

    public static void main(String[] args) {
        BitwiseStudy bitwiseStudy = new BitwiseStudy();
//        bitwiseStudy.studyAnd();
//        bitwiseStudy.studyOr();
//        bitwiseStudy.studyXor();
//        bitwiseStudy.studyNot();
//        bitwiseStudy.studyLeftShift();
        bitwiseStudy.studyRightShift();
    }
}
