package kr.hs.dgsw.java.scanner;

import java.util.Scanner;

public class ScannerStudy {
    private Scanner scanner = null;

    public void prepareScanner() {
        this.scanner = new Scanner(System.in);

        System.out.println();
    }

    public void testRead() {
        String str;
//        while (true) {
//            str = this.scanner.next();
//            if (str.equals("QUIT")) break;
//            System.out.println("출력 : " + str);
//        }
        byte value = this.scanner.nextByte();
        System.out.println("Int value : " + (value + 5));
    }

    public void closeScanner() {
        this.scanner.close();
    }

    public static void main(String[] args) {
        ScannerStudy study = new ScannerStudy();
        study.prepareScanner();
        study.testRead();
        study.closeScanner();
    }
}
