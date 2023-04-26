package kr.hs.dgsw.java.inherit;

public /* final */ class Person {
    protected final String name;

//    public Person() {
//        this.name = "홍길동";
//    }

    public Person(String name) {
        this.name = name;
    }

    public /* final */ String getName() {
        return name;
    }
}
