package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.util.Comparador;
import entities.Quadrado;
import entities.Retangulo;
import entities.enums.Cor;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Cor amarelo = Cor.AMARELO;
        Cor azul = Cor.AZUL;
        Cor vermelho = Cor.VERMELHO;

        Circulo c1 = new Circulo(azul, 100.0);
        Circulo c2 = new Circulo(vermelho, 110.0);
        Retangulo r1 = new Retangulo(amarelo, 6.25 , 4.0);
        Quadrado q1 = new Quadrado(vermelho, 5.0);

        System.out.println("CIRCULO:");
        System.out.print("> Área: " + String.format("%.2f", c1.area()));
        System.out.print("\n> Perímetro: " + String.format("%.2f", c1.perimetro()));
        System.out.println();
        System.out.println("RETÂNGULO:");
        System.out.print("> Área: " + String.format("%.2f", r1.area()));
        System.out.print("\n> Perímetro: " + String.format("%.2f", r1.perimetro()));
        System.out.println();
        System.out.println("QUADRADO:");
        System.out.print("> Área: " + String.format("%.2f", q1.area()));
        System.out.print("\n> Perímetro: " + String.format("%.2f", q1.perimetro()));
        System.out.println();

        System.out.println("\nMAIOR ÁREA ENTRE 2 FORMAS: " + Comparador.maior(q1, r1));
        System.out.println("MAIOR ÁREA ENTRE 2 FORMAS: " + Comparador.maior(c1, c2));
        System.out.println("MAIOR ÁREA ENTRE 3 FORMAS: " + Comparador.maior(q1, r1, c1));

        sc.close();
    }
}