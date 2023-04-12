package kr.hs.dgsw.java.array;

import java.util.Random;

public class MyArray {
    int[] array = new int[19];

    void makeSample() {
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    void printArray() {
        for (int character : array) {
            System.out.print(character + ", ");
        }
    }

    int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                idx = i;
            }
        }
        return idx;
    }

    int sum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    double avg(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.makeSample();
        myArray.printArray();
    }
}
