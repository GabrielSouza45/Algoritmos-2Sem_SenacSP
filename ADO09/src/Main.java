public class Main {
    public static void main(String[] args) {

        Ui ui = new Ui();
        ListaTarefas lista = new ListaTarefas();

        lista.setTitulo(ui.getString("Digite o nome da lista: "));

        while (true) {

            int escolha = ui.menu();

            if (escolha == 0){
                break;
            }

            switch (escolha) {
                case 1 -> lista.adicionar(ui.getString("Digite a tarefa: "));
                case 2 -> lista.remover(ui.getInt("Digite a posição da tarefa na lista: "));
                case 3 -> lista.printarLista();
                default -> ui.mandarMensagem("Valor inválido.");
            }
        }
    }
}
