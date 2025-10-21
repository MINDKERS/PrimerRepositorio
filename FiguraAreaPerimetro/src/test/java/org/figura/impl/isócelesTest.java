package org.figura.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isócelesTest {
    isóceles iso;
    @Test
    void perimetro() {
        iso = new isóceles();
        iso.setBase(5);
        iso.setLado1(10);
        assertEquals(25,iso.perimetro());
    }
}