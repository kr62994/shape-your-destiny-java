package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsoscelesRightTriangleTest {
    private IsoscelesRightTriangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new IsoscelesRightTriangle(2);
    }

    @Test
    void testArea() {
        assertEquals(2, triangle.getArea(), 0.0001);
    }

    @Test
    void testPerimeter() {
        assertEquals(4 + 2 * Math.sqrt(2), triangle.getPerimeter(), 0.0001);
    }

    @Test
    void handlesZero() {
        triangle = new IsoscelesRightTriangle(0);

        assertEquals(0, triangle.getArea(), 0.0001);
        assertEquals(0, triangle.getPerimeter(), 0.0001);
    }

    @Test
    void oneDimension() {
        triangle = new IsoscelesRightTriangle(1);

        assertEquals(0.5, triangle.getArea(), 0.0001);
        assertEquals(2 + Math.sqrt(2), triangle.getPerimeter(), 0.0001);
    }

    @Test
    void isIndependent() {
        IsoscelesRightTriangle other = new IsoscelesRightTriangle(4);

        assertEquals(8, other.getArea(), 0.0001);
        assertEquals(8 + 4 * Math.sqrt(2), other.getPerimeter(), 0.0001);
        assertEquals(2, triangle.getArea(), 0.0001);
        assertEquals(4 + 2 * Math.sqrt(2), triangle.getPerimeter(), 0.0001);
    }

    @Test
    void doFractions() {
        triangle = new IsoscelesRightTriangle(0.5);

        assertEquals(0.125, triangle.getArea(), 0.0001);
        assertEquals(1 + Math.sqrt(0.5), triangle.getPerimeter(), 0.0001);
    }

    @Test
    void testPolygon() {
        Polygon polygon = triangle;

        assertEquals(3, polygon.numberOfSides());
    }

    @Test
    void testInheritance() {
        RightTriangle parent = triangle;

        assertEquals(2, parent.getArea(), 0.0001);
        assertEquals(4 + 2 * Math.sqrt(2), parent.getPerimeter(), 0.0001);
        assertEquals(3, parent.numberOfSides());
    }
}
