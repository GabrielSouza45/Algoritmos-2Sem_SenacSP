public class Boletim {

    public Resultado avaliar(NotasAluno notasAluno){

        Aluno aluno = notasAluno.getAluno();
        NotaDisciplina[] disciplinas = notasAluno.getDisciplinas();


        int reprovacoes = 0;
        int aprovacoes = 0;
        for (NotaDisciplina disc : disciplinas) {

            String situacao = verificarSitucao(
              disc.getMedia(),
              disc.getFaltas()
            );

            if (situacao.equals("DP por Faltas") || situacao.equals("DP por Nota")){
                reprovacoes ++;
            } else {
                aprovacoes ++;
            }
        }

        Resultado resultado = new Resultado();
        resultado.setAluno(aluno);
        resultado.setDisciplinas(disciplinas);
        resultado.setSituacao( (reprovacoes > 0) ? "Reprovado" : "Aprovado" );
        resultado.setQtdAprovacoes(aprovacoes);
        resultado.setQtdReprovacoes(reprovacoes);

        return resultado;
    }

    private String verificarSitucao(double media, int faltas) {

        if (faltas > 4) {

            return "DP por Faltas";

        } else if (media < 6) {

            return "DP por Nota";

        } else {

            return "Aprovado";

        }

    }



}
