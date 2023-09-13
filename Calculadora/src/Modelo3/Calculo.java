package Modelo3;

public class Calculo {

    public double executarFuncao(int funcao, double n1, double n2) {
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

    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    public double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public double dividir(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }

}
