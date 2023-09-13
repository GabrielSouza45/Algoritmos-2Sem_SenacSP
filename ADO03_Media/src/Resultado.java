public class Resultado {

    private Aluno aluno;
    private NotaDisciplina[] disciplinas;


    private String situacao;
    private int qtdReprovacoes;
    private int qtdAprovacoes;

    public Resultado() {
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public NotaDisciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(NotaDisciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getQtdReprovacoes() {
        return qtdReprovacoes;
    }

    public void setQtdReprovacoes(int qtdReprovacoes) {
        this.qtdReprovacoes = qtdReprovacoes;
    }

    public int getQtdAprovacoes() {
        return qtdAprovacoes;
    }

    public void setQtdAprovacoes(int qtdAprovacoes) {
        this.qtdAprovacoes = qtdAprovacoes;
    }
}
