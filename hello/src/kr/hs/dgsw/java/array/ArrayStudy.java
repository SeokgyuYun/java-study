package kr.hs.dgsw.java.array;

public class ArrayStudy {
    void study() {
        // 배열의 선언
        int[] intArray = new int[5];
        int intArray2[] = new int[5];

        double[] doubleArray = new double[20];
        String[] strArray = new String[12];

        boolean[] booleanArray = new boolean[5];

        // 읽고 쓰기
        intArray[2] = 7;
        strArray[4] = "Korea";

        System.out.println(strArray[4]);
        System.out.println(intArray[0]);
        System.out.println(booleanArray[0]);
    }

    void studyInit() {
        int[] intArray = new int[] {5, 4, 8, 3, 1, 4};
        System.out.println(intArray[3] + intArray[2]);

        String[] colors = new String[] {"빨간색", "주황색", "노란색", "초록색", "파란색", "남색", "보라색"};

        int lengthOfColors = colors.length;

        for (String color : colors) {
            System.out.println(color);
        }

//        intArray[6] = 12;
//        intArray[-1] = 3;
    }

    public static void main(String[] args) {
        ArrayStudy arrayStudy = new ArrayStudy();
//        arrayStudy.study();
        arrayStudy.studyInit();
    }
}
