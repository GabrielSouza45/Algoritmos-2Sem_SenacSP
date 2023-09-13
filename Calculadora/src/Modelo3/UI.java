package Modelo3;

import java.util.Scanner;

public class UI {
    static Scanner sc = new Scanner(System.in);

    public void exibirResultado(double resultado, double n1, double n2, int funcao) {
        System.out.println("==============================================");
        switch (funcao) {
            case 1 -> mandarMensagem(n1 + " + " + n2 + " = " + resultado);
            case 2 -> mandarMensagem(n1 + " - " + n2 + " = " + resultado);
            case 3 -> mandarMensagem(n1 + " * " + n2 + " = " + resultado);
            case 4 -> mandarMensagem(n1 + " / " + n2 + " = " + resultado);
            default -> mandarMensagem("Função inexistente");
        }
        System.out.println("==============================================");

    }

    public void mandarMensagem(String msg) {
        System.out.println(msg);
    }

    public int pedirFuncao() {
        mandarMensagem("========================");
        mandarMensagem("Escolha a função: ");
        mandarMensagem("1. Soma");
        mandarMensagem("2. subtração");
        mandarMensagem("3. Multiplicação");
        mandarMensagem("4. Divisão");
        mandarMensagem("0. Sair");
        mandarMensagem("========================");
        return sc.nextInt();
    }

    public  double pedirValor(String msg) {
        mandarMensagem(msg);
        return sc.nextDouble();
    }

}
