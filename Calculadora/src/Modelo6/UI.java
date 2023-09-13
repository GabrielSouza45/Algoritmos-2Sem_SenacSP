package Modelo6;

import java.util.Scanner;

public class UI {
    static Scanner sc = new Scanner(System.in);

    public int exibirMenu(){
        System.out.println("====================================");
        System.out.println("Digite 1 para continuar");
        System.out.println("Digite 0 para sair");
        System.out.println("====================================");

        return sc.nextInt();
    }

    public void exibirResultado(double resultado, double n1, double n2, double n3) {
        System.out.println("==============================================");
        System.out.printf("(%.1f + %.1f + %.1f) / 3 = %.1f", n1, n2, n3, resultado);
        System.out.println();
        System.out.println("==============================================");
    }

    public void mandarMensagem(String msg) {
        System.out.println(msg);
    }

    public  double pedirValor(String msg) {
        mandarMensagem(msg);
        return sc.nextDouble();
    }

}
