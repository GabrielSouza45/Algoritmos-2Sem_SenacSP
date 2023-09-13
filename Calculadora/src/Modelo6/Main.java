package Modelo6;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    // ABSTRAÇÃO
    //Capacidade de se concentrar no essencial e esconder os detalhes

    public static void main(String[] args) {

        int resposta = 1;
        do {

            Boletim calc = new Boletim();
            UI ui = new UI();

            resposta = ui.exibirMenu();


            calc.setNota1(ui.pedirValor("Digite a primeira nota: "));
            calc.setNota2(ui.pedirValor("Digite a segunda nota: "));
            calc.setNota3(ui.pedirValor("Digite a terceira nota: "));

            calc.calcularMedia();

            ui.exibirResultado(calc.getMedia(), calc.getNota1(), calc.getNota2(), calc.getNota3());
        } while ( resposta != 0 );
    }
}