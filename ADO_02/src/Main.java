import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Compra compra = new Compra();

        System.out.println("Digite o valor total da compra: ");
        compra.setTotal(sc.nextDouble());

        System.out.println("Digite a quantidade de parcelas: ");
        compra.setParcelas(sc.nextInt());


        Pagamento pagamento = new Pagamento();
        double total = pagamento.calcularTotal(compra);
        double parcela = pagamento.calcularParcelas(total, compra.getParcelas());

        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("Valor final da compra: " + format.format(total));
        System.out.println("Valor final das parcelas: " + format.format(parcela));

    }

}
