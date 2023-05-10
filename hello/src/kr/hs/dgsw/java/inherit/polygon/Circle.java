package kr.hs.dgsw.java.inherit.polygon;

public class Circle extends Polygon {
    private static final double PIE = 3.14;
    protected final double radius;


    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getSize() {
        return radius * radius * PIE;
    }

    public static void main(String[] args) {
        Circle circle = new Circle("직사각형", 5);
        double size = circle.getSize();
        System.out.println(size);
    }
}
