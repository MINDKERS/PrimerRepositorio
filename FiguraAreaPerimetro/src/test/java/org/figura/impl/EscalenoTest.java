package org.figura.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscalenoTest {
    Escaleno esca;
    @Test
    void perimetro() {
        esca = new Escaleno();
        esca.setBase(5);
        esca.setLado1(6);
        esca.setLado2(7);
        assertEquals(18, esca.perimetro());
    }

    @Test
    void area() {
        esca = new Escaleno();
        esca.setBase(5);
        esca.setAltura(6);
        assertEquals(15, esca.area());
    }
}