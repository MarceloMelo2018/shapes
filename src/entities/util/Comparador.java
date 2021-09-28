package entities.util;

import entities.Forma;

public class Comparador {

    public static Forma maior(Forma f1, Forma f2) {
        if (f1.area() > f2.area()) {
            return f1;
        }
        return f2;
    }

    public static Forma maior(Forma f1, Forma f2, Forma f3) {
        if (f1.area() > f2.area() && f1.area() > f3.area()) {
            return f1;
        }
        else if (f2.area() > f1.area() && f2.area() > f3.area()) {
            return f2;
        }
        return f3;
    }
}