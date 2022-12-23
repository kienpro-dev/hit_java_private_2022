package Bai2;

public class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * 3.14 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * 3.14;
    }
}
