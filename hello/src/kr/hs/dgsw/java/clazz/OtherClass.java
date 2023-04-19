package kr.hs.dgsw.java.clazz;

public class OtherClass {
    public static void main(String[] args) {
        AccessModifier object = new AccessModifier();
//        object.value2 = 5;  // value2는 private로 선언되어있어서 다른 클래스에서는 접근할 수 없다.
        object.value3 = 6;
        object.value1 = 6;
        object.value4 = 7;
    }
}
