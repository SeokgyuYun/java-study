package kr.hs.dgsw.java.array;

import java.util.Scanner;

public class SimpleStack {
    private static final int SIZE = 10;
    private String[] array = new String[SIZE];
    private int top = 0;

    public void push(String value) {
        array[top++] = value;
    }

    public String pop() {
        return array[--top];
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public boolean isFull() {
        return top >= SIZE;
    }

    public int size() {
        return top;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleStack stack = new SimpleStack();

        String word = null;
        String command;

        while (true) {
            command = sc.next();

            if (command.equals("push")) {
                if (stack.isFull()) {
                    System.out.println("Stack Full");
                    continue;
                }
                word = sc.next();
                stack.push(word);
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println("Stack Empty");
                    continue;
                }
                System.out.println(stack.pop());
            } else if (command.equals("quit")) {
                break;
            } else if (command.equals("size")) {
                System.out.println(stack.size());
            }else {
                System.out.println("Unknown command");
            }
        }
        sc.close();
    }
}
