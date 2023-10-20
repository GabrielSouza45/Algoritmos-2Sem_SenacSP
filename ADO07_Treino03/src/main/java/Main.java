import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.println();
        System.out.println("Digite a quantidade de parcelas: ");
        int parc = sc.nextInt();
        System.out.println();

        Pedido pedido = new Pedido();
        pedido.setValor(valor);
        pedido.setParcelas(parc);

        DecimalFormat pattern = new DecimalFormat("0.00");

        System.out.println("Total do pedido: R$" + pattern.format(pedido.total()));
        System.out.println("Valor da parcela: R$" + pattern.format(pedido.getValorParcela()));

    }
}
