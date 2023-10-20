package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();
        System.out.println();
        System.out.println("Digite seu ano de nascimento completo: ");
        int nasc = sc.nextInt();
        System.out.println();

        Pessoa pessoa = new Pessoa();
        pessoa.setNomeCompleto(nome);
        pessoa.setAnoNasc(nasc);

        System.out.println("Idade: " + pessoa.idade());
        System.out.println("Primeiro nome: " + pessoa.primeiroNome());
        System.out.println("Último nome: " + pessoa.ultimoNome());

    }
}
