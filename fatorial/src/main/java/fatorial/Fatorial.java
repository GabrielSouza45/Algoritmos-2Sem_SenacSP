package fatorial;

public class Fatorial {

    public int calcular(int numero) {

        if (numero == 1) {
            System.out.print(numero + " = ");
            return numero;
        }

        System.out.print(numero + " * ");


        return numero * calcular(numero - 1);

    }

}
