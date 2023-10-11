package src.triangulo_retangulo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o catato oposto: ");
        double catetoOposto = sc.nextDouble();
        System.out.println();
        System.out.println("Digite o catato adjacente: ");
        double catetoAdjacente = sc.nextDouble();
        System.out.println();

        TrianguloRetangulo triangulo = new TrianguloRetangulo(catetoOposto, catetoAdjacente);

        DecimalFormat pattern = new DecimalFormat("0.00");

        System.out.println("Área: " + pattern.format(triangulo.getArea()));
        System.out.println("Perímetro: " + pattern.format(triangulo.getPerimetro()));
        System.out.println("Hipotenusa: " + pattern.format(triangulo.getHipotenusa()));


    }
}
