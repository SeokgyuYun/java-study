package kr.hs.dgsw.java.array;

import java.util.Scanner;

public class Queue {
    private static final int SIZE = 10;
    private String[] circularQueue = new String[SIZE];
    private int front = 0;
    private int rear = 0;

    public void enQueue(String value) {
        circularQueue[(++rear) % SIZE] = value;
    }

    public String deQueue() {
        return isEmpty() ? "큐가 비었습니다." : circularQueue[(++front) % SIZE];
    }

    public boolean isFull() {
        return (rear + 1) % SIZE == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public int size() {
        return (rear - front + SIZE) % SIZE;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);

        String command;
        String word;

        while (true) {
            command = sc.next();
            if (command.equals("enqueue")) {
                if (queue.isFull()) {
                    System.out.println("큐가 가득 찼습니다.");
                    continue;
                }
                word = sc.next();
                queue.enQueue(word);
            } else if (command.equals("dequeue")) {
                System.out.println(queue.deQueue());
            } else if (command.equals("quit")) {
                break;
            } else if (command.equals("size")) {
                System.out.println(queue.size());
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
