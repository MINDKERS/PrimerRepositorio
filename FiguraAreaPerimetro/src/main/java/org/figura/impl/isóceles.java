package org.figura.impl;

import lombok.Data;

@Data
public class isóceles extends Triangulo{
    protected double lado1;

    @Override
    public double perimetro(){
        return base + 2*lado1;
    }
}
