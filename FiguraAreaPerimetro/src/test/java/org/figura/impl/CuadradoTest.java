package org.figura.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class CuadradoTest {
    Cuadrado cuadrado;

    @Test
    void area()
    {
        assertEquals(5, 5);
    }

    @Test
    void testArea() {
        cuadrado = new Cuadrado();
        cuadrado.setLado( 5 );
        assertEquals( 25, cuadrado.area() );

        for (int i = 0; i < 10; i++) {
            cuadrado.setLado(i);
            assertEquals(i * i,cuadrado.area());
        }
    }

    @Test
    void perimetro() {
        cuadrado = new Cuadrado();
        assertNotNull(cuadrado);
        cuadrado.setLado(8);
        assertEquals(32, cuadrado.perimetro());
    }
}
