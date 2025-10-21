package org.figura.impl;

import lombok.Data;

@Data
public class Equilatero extends Triangulo {
    @Override
    public double perimetro() {
        return base * 3 ;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }
}
