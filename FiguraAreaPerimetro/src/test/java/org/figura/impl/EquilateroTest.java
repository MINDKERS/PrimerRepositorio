package org.figura.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquilateroTest {
    Equilatero equilatero;
    @Test
    void perimetro() {
        equilatero = new Equilatero();
        equilatero.setBase(5);
        assertEquals(15, equilatero.perimetro());
    }

    @Test
    void area() {
        equilatero = new Equilatero();
        equilatero.setBase(5);
        equilatero.setAltura(6);
        assertEquals(15, equilatero.area());
    }
}
