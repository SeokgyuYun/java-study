package kr.hs.dgsw.java.inherit;

public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "나의 이름은 " + super.getName() + "입니다.";
    }
}
