package kr.hs.dgsw.java.exception;

public class ExceptionStudy {
    public void nullMethod() {
        String name = null;
        int length = name.length();
    }

    public int divide(int op1, int op2) {
        try {
            return op1 / op2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("'0'으로 나눌 수 없습니다.");
            return 0;
        }
    }

    public static void main(String[] args) {
        ExceptionStudy study = new ExceptionStudy();
//        study.nullMethod();
        study.divide(3, 0);
    }
}
