package bases;

import java.util.Scanner;

public class Ui {
    Scanner sc = new Scanner(System.in);

    public int menu(){
        System.out.println("""
                \n==== Menu ====
                __Escolha uma opção__
                1. Multiplicador
                2. Potencia
                3. Máximo Divisor
                4. Finalizar Programa
                """);

        int esc = sc.nextInt();
        sc.nextLine();
        return esc;
    }


    public int getInt(String s) {

        System.out.println(s);
        int get = sc.nextInt();
        sc.nextLine();
        return get;

    }
}
