package org.figura.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {
    Triangulo tri;
    @Test
    void perimetro() {
        tri = new Triangulo();
        tri.setBase(5);
        assertEquals(15,tri.perimetro());
    }

    @Test
    void area() {
        tri = new Triangulo();
        tri.setBase(5);
        tri.setAltura(8);
        assertEquals(20,tri.area());
        tri.setBase(0);
        tri.setAltura(8);
        assertEquals(0,tri.area());
        tri.setBase(6);
        tri.setAltura(0);
        assertEquals(0,tri.area());
    }
}