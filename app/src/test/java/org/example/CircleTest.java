package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(3);
    }

    @Test
    void testArea() {
        assertEquals(9 * Math.PI, circle.getArea(), 0.0001);
    }

    @Test
    void testPerimeter() {
        assertEquals(6 * Math.PI, circle.getPerimeter(), 0.0001);
    }

    @Test
    void handlesZero() {
        circle = new Circle(0);

        assertEquals(0, circle.getArea(), 0.0001);
        assertEquals(0, circle.getPerimeter(), 0.0001);
    }

    @Test
    void oneDimension() {
        circle = new Circle(1);

        assertEquals(Math.PI, circle.getArea(), 0.0001);
        assertEquals(2 * Math.PI, circle.getPerimeter(), 0.0001);
    }

    @Test
    void isIndependent() {
        Circle other = new Circle(5);

        assertEquals(25 * Math.PI, other.getArea(), 0.0001);
        assertEquals(10 * Math.PI, other.getPerimeter(), 0.0001);
        assertEquals(9 * Math.PI, circle.getArea(), 0.0001);
        assertEquals(6 * Math.PI, circle.getPerimeter(), 0.0001);
    }

    @Test
    void doFractions() {
        circle = new Circle(0.5);

        assertEquals(Math.PI / 4, circle.getArea(), 0.0001);
        assertEquals(Math.PI, circle.getPerimeter(), 0.0001);
    }
}
