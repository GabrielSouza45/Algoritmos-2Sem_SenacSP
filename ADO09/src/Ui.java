import java.util.Scanner;

public class Ui {

    Scanner sc = new Scanner(System.in);

    public void mandarMensagem(String msg){
        System.out.println(msg);
    }
    public String getString(String msg){
        mandarMensagem(msg);
        return sc.nextLine();
    }
    public int getInt(String msg){
        mandarMensagem(msg);
        int esc = sc.nextInt();
        sc.nextLine();
        return esc;
    }


    public int menu(){

        return getInt("""
                
                Menu
                ---
                O que deseja fazer?
                1. Adicionar tarefa
                2. Remover tarefa
                3. Exibir lista
                0. Sair
                
                """);

    }
}
