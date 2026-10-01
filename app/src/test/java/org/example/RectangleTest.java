package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(4, 5);
    }

    @Test
    void testArea() {
        assertEquals(20, rectangle.getArea(), 0.0001);
    }

    @Test
    void testPerimeter() {
        assertEquals(18, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void handlesZero() {
        rectangle = new Rectangle(0, 0);

        assertEquals(0, rectangle.getArea(), 0.0001);
        assertEquals(0, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void oneDimension() {
        rectangle = new Rectangle(1, 1);

        assertEquals(1, rectangle.getArea(), 0.0001);
        assertEquals(4, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void isIndependent() {
        Rectangle other = new Rectangle(2, 7);

        assertEquals(14, other.getArea(), 0.0001);
        assertEquals(18, other.getPerimeter(), 0.0001);
        assertEquals(20, rectangle.getArea(), 0.0001);
        assertEquals(18, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void doFractions() {
        rectangle = new Rectangle(0.5, 1.5);

        assertEquals(0.75, rectangle.getArea(), 0.0001);
        assertEquals(4, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void testPolygon() {
        Polygon polygon = rectangle;

        assertEquals(4, polygon.numberOfSides());
    }

    @Test
    void testParallelogram() {
        Parallelogram parallelogram = rectangle;
        Polygon polygon = parallelogram;

        assertEquals(4, parallelogram.numberOfSides());
        assertEquals(4, polygon.numberOfSides());
    }
}
