package entities.util;

import entities.Forma;

public class Comparador {

    public static Forma maior(Forma f1, Forma f2) {
        return f1.area() > f2.area() ? f1 : f2;
    }

    public static Forma maior(Forma f1, Forma f2, Forma f3) {
        return maior(maior(f1, f2), f3);
    }
}