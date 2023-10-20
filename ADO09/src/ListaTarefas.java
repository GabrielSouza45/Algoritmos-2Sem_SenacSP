import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private String titulo;
    private List<String> itens = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public void adicionar(String novoItem){

        this.itens.add(novoItem);

    }

    public void remover(int posicao){

        if (this.itens.isEmpty()){
            System.out.println("Não existem itens na lista");
            return;
        }
        if (posicao < 0 || (posicao) > itens.size()){
            System.out.println("Posição inexistente");
            return;
        }

        this.itens.remove(posicao - 1);

    }

    public void printarLista(){

        System.out.println(this);

    }

    @Override
    public String toString() {
        String cabecalho = ("======= "+titulo+" =======\n");
        String lista = "";

        for (int i = 0; i < itens.size(); i++){
            lista += ((i+1) + ". " + itens.get(i) + "\n");
        }

        return cabecalho + lista;
    }
}
