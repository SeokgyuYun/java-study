package kr.hs.dgsw.java;

public class Person {
    String name = "홍길동";
    int age = 0;
    double height = 0.0;

    void aged() {
        age++;
        height += 6.2;
    }

    void printInformation() {
        System.out.println(name + "님의 나이는 " + age + "세 이고 키는 " + height + "cm 입니다.");
    }

    Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Person seokgyu = new Person("윤석규", 18, 166.5);
        seokgyu.aged();
        seokgyu.printInformation();
    }
}
