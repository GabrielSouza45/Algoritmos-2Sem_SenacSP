package Modelo2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        double numero1;
        double numero2;
        int funcao;
        double resultado;

        do {
            funcao = pedirFuncao();

            if (funcao == 0) {
                mandarMensagem("Programa finalizado");
                break;
            }

            numero1 = pedirValor("Digite o primeiro valor: ");
            numero2 = pedirValor("Digite o segundo valor: ");

            resultado = executarFuncao(funcao, numero1, numero2);

            exibirResultado(resultado, numero1, numero2, funcao);

        } while (funcao != 0);
    }

    private static void exibirResultado(double resultado, double n1, double n2, int funcao) {
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

    private static void mandarMensagem(String msg) {
        System.out.println(msg);
    }

    private static double executarFuncao(int funcao, double n1, double n2) {
        double resultado = 0;
        switch (funcao) {
            case 1 -> resultado = somar(n1, n2);
            case 2 -> resultado = subtrair(n1, n2);
            case 3 -> resultado = multiplicar(n1, n2);
            case 4 -> resultado = dividir(n1, n2);
            default -> resultado = 0.0;
        }

        return resultado;
    }

    private static int pedirFuncao() {
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

    public static double pedirValor(String msg) {
        mandarMensagem(msg);
        return sc.nextDouble();
    }

    public static double somar(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public static double dividir(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }
}