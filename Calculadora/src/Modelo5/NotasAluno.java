package Modelo5;

import java.util.Scanner;

public class NotasAluno {
    private double nota1;
    private double nota2;
    private double nota3;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void pedirNotas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        this.nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        this.nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        this.nota3 = sc.nextDouble();

    }
}