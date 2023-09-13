import java.util.Scanner;

public class UI {

    static Scanner sc = new Scanner(System.in);

    public int pedirMaterias(){
        System.out.println("Quantas matérias são? ");
        int qtdMaterias = sc.nextInt();
        sc.nextLine();

        return qtdMaterias;
    }

    public  Aluno pedirAluno(){

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.println("Digite o curso do aluno: ");
        aluno.setCurso(sc.nextLine());

        System.out.println("Digite a turma do aluno: ");
        aluno.setTurma(sc.nextLine());

        System.out.println("Digite o número da chamada do aluno: ");
        aluno.setChamada(sc.nextInt());
        sc.nextLine();

        return aluno;
    }

    public  NotaDisciplina[] pedirDisciplina(int qtd) {

        NotaDisciplina[] disciplinas = new NotaDisciplina[qtd];

        for (int i = 0; i < disciplinas.length; i++) {

            NotaDisciplina disciplina = new NotaDisciplina();

            System.out.println("Digite o nome da disciplina: ");
            disciplina.setDisciplina(sc.nextLine());

            System.out.println("Digite a média do aluno: ");
            disciplina.setMedia(sc.nextDouble());

            System.out.println("Digite a quantidade de faltas do aluno: ");
            disciplina.setFaltas(sc.nextInt());
            sc.nextLine();

            disciplinas[i] = disciplina;

            pularLinha();
        }

        return disciplinas;
    }

    public  void mostraResultado(Resultado resultado) {

        Aluno aluno = resultado.getAluno();
        NotaDisciplina[] notaDisciplinas = resultado.getDisciplinas();
        String situacao = resultado.getSituacao();
        int aprovacoes = resultado.getQtdAprovacoes();
        int reprovacoes = resultado.getQtdReprovacoes();

        System.out.println("================= Aluno =================");
        pularLinha();

        System.out.println("Nome : \n " + aluno.getNome());
        pularLinha();

        System.out.println("Curso : \n " + aluno.getCurso());
        pularLinha();

        System.out.println("Número da chamada : \n " + aluno.getChamada());
        pularLinha();

        System.out.println("Turma : \n " + aluno.getTurma());

        pularLinha();

        System.out.println("================= Notas =================");


        int disciplina = 0;
        for (NotaDisciplina nota : notaDisciplinas){

            disciplina++;
            pularLinha();

            System.out.println("==/ " + disciplina +" /==");

            System.out.println("Disciplina : \n " + nota.getDisciplina());
            pularLinha();

            System.out.println("Média : \n " + nota.getMedia());
            pularLinha();

            System.out.println("Faltas : \n " + nota.getFaltas());

            pularLinha();


        }

        System.out.println("=============== Situação ================");
        pularLinha();

        System.out.println("Situação : \n " + situacao);
        pularLinha();

        System.out.println("============== Aprovações ===============");
        pularLinha();

        System.out.println("Quantidade : \n " + aprovacoes);
        pularLinha();

        System.out.println("============== Reprovações ==============");
        pularLinha();

        System.out.println("Quantidade : \n " + reprovacoes);

    }

    public void pularLinha(){
        System.out.println("");
    }

}
