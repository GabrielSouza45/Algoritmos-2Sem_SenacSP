package fatorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                ==== FATORIAL ====
                - Digite o número para calcular seu fatorial:
                """);

        int numero = sc.nextInt();

        Fatorial fatorial = new Fatorial();

        System.out.print(numero + "! = ");
        int fat = fatorial.calcular(numero);
        System.out.print(fat);

        System.out.println();
        System.out.println(numero + "! = " + fat);

    }

}
