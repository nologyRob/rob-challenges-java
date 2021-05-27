package com.nology.classes_03;

import java.lang.Math;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void pow() {
        double result = Math.pow(2, 5);
        assertEquals(32.0, result);
    }

    @Test
    void min() {
        double result = Math.min(2, 5);
        assertEquals(2, result);
    }

    @Test
    void max() {
        double result = Math.max(2, 5);
        assertEquals(5, result);
    }

    @Test
    void round() {
        double result = Math.round(2.420);
        assertEquals(2, result);
    }
}