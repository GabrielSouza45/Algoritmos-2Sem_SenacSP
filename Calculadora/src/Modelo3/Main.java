package Modelo3;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        double numero1;
        double numero2;
        int funcao;
        double resultado;

        Calculo calc = new Calculo();
        UI ui = new UI();

        do {
            funcao = ui.pedirFuncao();

            if (funcao == 0) {
                ui.mandarMensagem("Programa finalizado");
                break;
            }

            numero1 = ui.pedirValor("Digite o primeiro valor: ");
            numero2 = ui.pedirValor("Digite o segundo valor: ");

            resultado = calc.executarFuncao(funcao, numero1, numero2);

            ui.exibirResultado(resultado, numero1, numero2, funcao);

        } while (true);
    }
}