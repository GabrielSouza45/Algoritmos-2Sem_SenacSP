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

        Pessoa pessoa = new Pessoa(nome, nasc);

        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Primeiro nome: " + pessoa.getPrimeiroNome());
        System.out.println("Último nome: " + pessoa.getUltimoNome());

    }
}
