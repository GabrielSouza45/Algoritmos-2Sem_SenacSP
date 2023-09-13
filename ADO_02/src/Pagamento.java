public class Pagamento {

    public double calcularTotal(Compra compra) {

        return (compra.getTotal() * Math.pow(1 + buscarTaxa(compra.getParcelas()), compra.getParcelas()));

    }

    public double calcularParcelas(double totalFinal, int parcelas) {

        return totalFinal / parcelas;

    }

    private double buscarTaxa(int parcelas) {

        if (parcelas == 0) {
            return 0.00d;
        } else if (parcelas >= 1 && parcelas <= 3) {
            return 0.03d;
        } else if (parcelas >= 4 && parcelas <= 12) {
            return 0.05d;
        } else {
            return 0.10d;
        }

    }
}
