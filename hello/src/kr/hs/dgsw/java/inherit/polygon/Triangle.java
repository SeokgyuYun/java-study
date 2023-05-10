package kr.hs.dgsw.java.inherit.polygon;

public class Triangle extends Rectangle {

    public Triangle(String name, double width, double height) {
        super(name, width, height);
    }

    public double getSize() {
        return super.getSize() / 2;
    }
}
