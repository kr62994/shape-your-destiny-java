package org.example;

public class RightTriangle extends Shape implements Polygon {
    private final double length;
    private final double width;

    public RightTriangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return 0.5 * length * width;
    }

    @Override
    public double getPerimeter() {
        return length + width + Math.sqrt(length * length + width * width);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}
