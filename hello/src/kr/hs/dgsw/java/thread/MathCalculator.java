package kr.hs.dgsw.java.thread;

import java.util.Random;
import java.util.Scanner;

public class MathCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int counter = 0;
        int answer = 0;
        boolean isSolved = false;

        for (int i = 0; i < 4; i++) {
            int val1 = random.nextInt(999);
            int val2 = random.nextInt(999);

            System.out.printf("%d + %d = ?\n", val1, val2);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                        System.out.printf("%d초 경과", counter);
                    } catch (InterruptedException e) {}
                }
            }).start();


            if (isSolved[0]) {
                System.out.println("정답입니다!!");
            } else {
                System.out.println("틀렸습니다!!");
            }

        }
    }
}