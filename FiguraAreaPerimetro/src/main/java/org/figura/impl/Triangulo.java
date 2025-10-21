package org.figura.impl;

import lombok.Data;
import org.figura.Figura;

@Data
public class Triangulo extends Figura {
    protected double base;
    protected double altura;

    @Override
    public double perimetro() {
        return base * 3;
    }

    @Override
    public double area() {
        if (base == 0 || altura == 0) {
            return 0.0;
        } else {return base*altura / 2;}
    }
}