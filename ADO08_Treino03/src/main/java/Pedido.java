public class Pedido {

    private double valor;
    private int parcelas;

    private double total;
    private double juros;
    private double valorParcela;


    public Pedido(double valor, int parcelas) {

        this.valor = valor;
        this.parcelas = parcelas;

        this.juros();
        this.total();

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }


    public double getTotal() {
        return total;
    }

    public double getJuros() {
        return juros;
    }

    public double getValorParcela() {
        return valorParcela;
    }


    private void total() {
        this.total = (parcelas == 0) ? valor : juros;
        this.valorParcela = (parcelas == 0) ? total : total / parcelas;
    }

    private void juros() {
        if (parcelas <= 0) {
            this.juros = 0;
            return;
        }
        this.juros = valor * Math.pow((1 + 0.01), parcelas);
    }
}
