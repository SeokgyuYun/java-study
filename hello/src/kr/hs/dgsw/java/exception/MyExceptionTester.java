package kr.hs.dgsw.java.exception;

import java.util.Scanner;

public class MyExceptionTester {
    public void method1(String name) {
        try {
            method2(name);
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("name 변수가 null 일 수 없습니다");
        }
    }

    public void method2(String name) throws MyException {
        if (name != null) {
            System.out.printf("Hello %s\n", name);
        } else {
            MyException e = new MyException();
            throw e;
        }
    }

    public static void main(String[] args) {
        MyExceptionTester tester = new MyExceptionTester();
        tester.method1("Brown");

    }
}
