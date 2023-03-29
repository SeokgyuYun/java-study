package kr.hs.dgsw.java.operation;

public class CastingStudy {
    void studySome() {
        int intValue = 3;
        double doubleValue = 3;

        intValue = (int) 3.14;

        System.out.println(intValue);

        long longValue = intValue;
        intValue = (int) longValue;

//        boolean bool = (boolean) 0;

        char ch = 'A';
        intValue = (int) ch;

        String str = "123";
//        intValue = (int) str;

    }

}
