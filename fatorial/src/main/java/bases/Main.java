package bases;

public class Main {

    public static void main(String[] args) {

        menu();

    }

    private static void menu(){
        Bases bases = new Bases();
        Ui ui = new Ui();

        int esc = ui.menu();

        int a = ui.getInt("Digite o valor de A:");
        int b = ui.getInt("Digite o valor de B:");

        switch (esc) {

            case 1 -> {
                int mult = bases.multiplicador(a, b);
                System.out.println(a +" * "+ b +" = "+ mult);

            }
            case 2 -> {
                int pot = bases.potencia(a, b);
                System.out.println(a +" ^ "+ b +" = "+ pot);

            }
            case 3 -> {
                System.out.println(bases.maximoDivisor(a, b));

            }
            case 4 -> {
                System.exit(0);

            }
            default -> {
                System.out.println("Valor incorreto!");
            }
        }

        menu();

    }

}
