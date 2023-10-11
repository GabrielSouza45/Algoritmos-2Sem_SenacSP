package src.retangulo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a base do retângulo: ");
        double base = sc.nextDouble();
        System.out.println();
        System.out.println("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        System.out.println();

        Retangulo retangulo = new Retangulo(base, altura);

        DecimalFormat pattern = new DecimalFormat("0.00");

        System.out.println("Área: " + pattern.format(retangulo.getArea()));
        System.out.println("Perímetro: " + pattern.format(retangulo.getPerimetro()));


    }
}
