package Modelo5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        NotasAluno notas1 = new NotasAluno();
        NotasAluno notas2 = new NotasAluno();

        notas1.pedirNotas();

        notas2.pedirNotas();


        Boletim boletim = new Boletim();
        double media1 = boletim.calcularMedia(notas1);
        String situacao1 = boletim.verificarSituacao(media1);

        double media2 = boletim.calcularMedia(notas2);
        String situacao2 = boletim.verificarSituacao(media2);

        System.out.println(media1);
        System.out.println(situacao1);

        System.out.println();

        System.out.println(media2);
        System.out.println(situacao2);

    }


}
