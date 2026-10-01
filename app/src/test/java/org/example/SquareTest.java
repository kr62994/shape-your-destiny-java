package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square square;

    @BeforeEach
    void setUp() {
        square = new Square(4);
    }

    @Test
    void testArea() {
        assertEquals(16, square.getArea(), 0.0001);
    }

    @Test
    void testPerimeter() {
        assertEquals(16, square.getPerimeter(), 0.0001);
    }

    @Test
    void handlesZero() {
        square = new Square(0);

        assertEquals(0, square.getArea(), 0.0001);
        assertEquals(0, square.getPerimeter(), 0.0001);
    }

    @Test
    void oneDimension() {
        square = new Square(1);

        assertEquals(1, square.getArea(), 0.0001);
        assertEquals(4, square.getPerimeter(), 0.0001);
    }

    @Test
    void isIndependent() {
        Square other = new Square(7);

        assertEquals(49, other.getArea(), 0.0001);
        assertEquals(28, other.getPerimeter(), 0.0001);
        assertEquals(16, square.getArea(), 0.0001);
        assertEquals(16, square.getPerimeter(), 0.0001);
    }

    @Test
    void doFractions() {
        square = new Square(0.5);

        assertEquals(0.25, square.getArea(), 0.0001);
        assertEquals(2, square.getPerimeter(), 0.0001);
    }

    @Test
    void testPolygon() {
        Polygon polygon = square;

        assertEquals(4, polygon.numberOfSides());
    }

    @Test
    void testInheritance() {
        Rectangle parent = square;

        assertEquals(16, parent.getArea(), 0.0001);
        assertEquals(16, parent.getPerimeter(), 0.0001);
        assertEquals(4, parent.numberOfSides());
    }

    @Test
    void testParallelogram() {
        Parallelogram parallelogram = square;

        assertEquals(4, parallelogram.numberOfSides());
    }
}
