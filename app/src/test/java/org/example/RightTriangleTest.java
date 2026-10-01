package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {
    private RightTriangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new RightTriangle(3, 4);
    }

    @Test
    void testArea() {
        assertEquals(6, triangle.getArea(), 0.0001);
    }

    @Test
    void testPerimeter() {
        assertEquals(12, triangle.getPerimeter(), 0.0001);
    }

    @Test
    void handlesZero() {
        triangle = new RightTriangle(0, 0);

        assertEquals(0, triangle.getArea(), 0.0001);
        assertEquals(0, triangle.getPerimeter(), 0.0001);
    }

    @Test
    void oneDimension() {
        triangle = new RightTriangle(1, 1);

        assertEquals(0.5, triangle.getArea(), 0.0001);
        assertEquals(2 + Math.sqrt(2), triangle.getPerimeter(), 0.0001);
    }

    @Test
    void isIndependent() {
        RightTriangle other = new RightTriangle(5, 12);

        assertEquals(30, other.getArea(), 0.0001);
        assertEquals(30, other.getPerimeter(), 0.0001);
        assertEquals(6, triangle.getArea(), 0.0001);
        assertEquals(12, triangle.getPerimeter(), 0.0001);
    }

    @Test
    void doFractions() {
        triangle = new RightTriangle(1.5, 2);

        assertEquals(1.5, triangle.getArea(), 0.0001);
        assertEquals(6, triangle.getPerimeter(), 0.0001);
    }


    @Test
    void testPolygon() {
        Polygon polygon = triangle;

        assertEquals(3, polygon.numberOfSides());
    }
}
