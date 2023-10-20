public class Pedido {

    private double valor;
    private int parcelas;
    private double valorParcela;


    public Pedido() {
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



    public double getValorParcela() {
        return valorParcela;
    }


    public double total() {
        double total = (parcelas <= 1) ? valor : juros();
        this.valorParcela = (parcelas <= 1) ? total : total / parcelas;
        return total;
    }

    private double juros() {
        return valor * Math.pow((1 + 0.01), parcelas);
    }
}
