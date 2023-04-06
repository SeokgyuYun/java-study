package kr.hs.dgsw.java.task;

import java.util.Scanner;

public class Money {
    void divideMoney(int money) {
        String[] currency = new String[] {"오만원권", "일만원권", "오천원권", "일천원권", "오백원권", "일백원권", "오십원권", "일십원권"};
        int[] won = new int[] {money / 50000, (money % 50000) / 10000, (money % 10000) / 5000, (money % 5000) / 1000, (money % 1000) / 500, (money % 500) / 100, (money % 100) / 50, (money % 50) / 10};

        for (int i = 0; i < won.length; i++) {
            if (won[i] != 0) {
                System.out.print(currency[i] + " " + won[i] + "장");
                if (i != won.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Money money = new Money();
        money.divideMoney(sc.nextInt());
        sc.close();
    }
}
