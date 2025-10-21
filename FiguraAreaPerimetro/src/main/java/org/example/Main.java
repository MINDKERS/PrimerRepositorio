package org.example;

import org.figura.Figura;
import org.figura.impl.Cuadrado;
import org.figura.impl.Equilatero;
import org.figura.impl.Triangulo;

public class Main {
    public static void main(String[] args) {
        Figura figura = new Cuadrado();
        Triangulo triangulo = null;

        ((Cuadrado)figura).setLado(5);
        imprimir(figura);

        figura = new Equilatero();
        triangulo = (Triangulo) figura;
        triangulo.setBase(5);
        triangulo.setAltura(7);
        imprimir(figura);
    }

    public static void imprimir(Figura figura){
        System.out.println(figura.area());
        System.out.println(figura.perimetro());
    }
}
