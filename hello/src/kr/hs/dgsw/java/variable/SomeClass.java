package kr.hs.dgsw.java.variable;

public class SomeClass {

    String name;
    final int VALUE = 5;
    final double PI = 3.1415926;
    void someMethod1() {
        int age = 18;
        name = "홍길동";

        if (true) {
            int value1 = 5;
            System.out.println(value1);
        }
    }

    void someMethod2() {
        this.name = "abcd";
        String name = "송혜교";
        System.out.println(this.name);
    }

    void doSomething() {
        final int value = 5;
//        value = 7;

        final int value1;
        value1 = 10;
//        value1 = 11;
    }
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.someMethod2();
    }
}
