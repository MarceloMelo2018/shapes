package entities;

import entities.enums.Cor;

public class Quadrado extends Retangulo {

    private Cor cor;
    private double lado;

    public Quadrado() {
        super();
    }

    public Quadrado(Cor cor, double lado) {
        super();
        this.cor = cor;
        this.lado = lado;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Quadrado " + getCor();
    }
}
