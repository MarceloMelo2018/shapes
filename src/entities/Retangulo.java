package entities;

import entities.enums.Cor;

public class Retangulo extends Forma {

    private double base;
    private double altura;

    public Retangulo() {
        super();
    }

    public Retangulo(Cor cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Retângulo " + getCor();
    }
}
