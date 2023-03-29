package kr.hs.dgsw.java.datatype;

public class DataTypeStudy {
    void studyInteger() {
        byte byteValue = 1;
        short shortValue = 1;
        int intValue = 1;
        long longValue = 1L;

        System.out.printf("byte %d ~ %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short %d ~ %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int %d ~ %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long %d ~ %d\n", Long.MIN_VALUE, Long.MAX_VALUE);

        byte max = 127;
        max += 1;
        System.out.printf("127 + 1 = %d\n", max);

        int value1 = 1200000000;
        int value2 = 1300000000;
        System.out.printf("%d + %d = %d\n", value1, value2, value1 + value2);

        shortValue = 128;
        byteValue = (byte) shortValue;
//        shortValue = byteValue;
        System.out.printf("%d -> %d\n", shortValue, byteValue);
    }

    void studyFloat() {
        float floatValue = 3.1415926535897932384626433832795f;
        double doubleValue = 3.1415926535897932384626433832795;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        float value1 = 0.0f;
        for (int i = 0; i < 1000; i++) {
            value1 += 0.001f;
        }
        System.out.printf("sum : %f", value1);
    }

    void studyBoolean() {
        boolean booleanValue = true;
        booleanValue = false;

        boolean value1 = (3 == 2);
    }

    void studyChar() {
        char charValue = 'A';
//        charValue = 65;
//        System.out.printf("%c : %d\n", charValue, (int)charValue);

        for (int i = 0; i <= 255; i++) {
            System.out.printf("%c : %d\n", (char)i, i);
        }
    }

    public static void main(String[] args) {
        DataTypeStudy dataTypeStudy = new DataTypeStudy();
//        dataTypeStudy.studyInteger();
//        dataTypeStudy.studyFloat();
        dataTypeStudy.studyChar();
    }
}
