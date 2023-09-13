public class Pagamento {

    public Comprovante faturarPedido(Pedido pedido){

        Comprovante comprovante = new Comprovante();
        comprovante.setCliente(pedido.getCliente());
        comprovante.setCodigo(gerarCodigo());
        comprovante.setItens(pedido.getItens());
        comprovante.setTotal(calcularTotal(pedido));

        return comprovante;
    }

    private double calcularTotal(Pedido pedido){
        Item[] itens = pedido.getItens();
        double total = 0;
        for (Item item : itens){
            total += item.getPreco();
        }

        return total;
    }

    private int gerarCodigo(){
        return (int)(Math.random()*100);
    }
}
