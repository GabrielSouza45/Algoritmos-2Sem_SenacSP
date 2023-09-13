import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        UI ui = new UI();
        ui.pularLinha();
        
        int qtdMaterias = ui.pedirMaterias();

        ui.pularLinha();

        Aluno aluno = ui.pedirAluno();
        ui.pularLinha();

        NotaDisciplina[] disciplinas =  ui.pedirDisciplina(qtdMaterias);
        ui.pularLinha();

        NotasAluno notasAluno = new NotasAluno();
        notasAluno.setAluno(aluno);
        notasAluno.setDisciplinas(disciplinas);

        Boletim boletim = new Boletim();

        ui.mostraResultado(boletim.avaliar(notasAluno));

    }

}
