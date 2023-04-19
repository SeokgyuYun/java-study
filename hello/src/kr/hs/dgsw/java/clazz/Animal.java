package kr.hs.dgsw.java.clazz;

public class Animal {

    private String name;

    private static String category;

    public Animal() {
//        this.name = "동물";
        this("동물");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void printName() {
//        System.out.println(this.name);
    }

    public String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        Animal elephant = new Animal("코끼리");
        Animal turtle = new Animal();

        elephant.category = "육상동물";
        turtle.category = "해양동물";

        System.out.println(elephant.name + "는 " + elephant.category + "입니다");
        System.out.println(turtle.name + "는 " + turtle.category + "입니다");
    }
}
