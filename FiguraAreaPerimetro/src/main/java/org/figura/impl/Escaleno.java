package org.figura.impl;

import lombok.Data;

@Data
public class Escaleno extends isóceles {
    private double lado1;
    private double lado2;
    @Override
    public double perimetro() {
        return base + lado1 + lado2;
    }

    public double area() {
        return base*altura / 2;
    }
}