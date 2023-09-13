public class LojaOnline {

    public NotaFiscal efetuarCompra(Compra compra){

    }

    private double calcularTotal(Compra compra){

        Item[] itens = compra.getCarrinho();

        double total = 0;

        for (Item item : itens){
            total = total + item.getPreco();
        }

        return total;
    }

    private double verificarCupom(String cupom){

        switch (cupom) {
            case "QUERO100" -> {
                return 100;
            }
            case "QUERO200" -> {
                return 200;
            }
            case "QUERO500" -> {
                return 500;
            }
            default -> {
                return 0;
            }
        }
    }

    private double calcularParcela(double total, int parcelas) {

    }

    private int gerarCodNota() {
        return (int)(Math.random()*100);
    }

}
