public class Boletim {
    public  Resultado processar (NotasAluno notas) {

        double media = calcularMedia(notas);
        String situacao = verificarsituacao(media, notas.getFaltas());

        Resultado resultado = new Resultado();
        resultado.setMedia(media);
        resultado.setSituacao(situacao);

        return resultado;
    }

    private double calcularMedia(NotasAluno notas){
        return ( notas.getNota1() + notas.getNota2() + notas.getNota3() ) / 3;
    }

    private String verificarsituacao(double media, int faltas) {
        if (media >= 6 && faltas <= 4) {
            return "Aprovado";
        } else if (media < 6 && faltas <= 4) {
            return "DP por Nota";
        } else {
            return "DP por Faltas";
        }
    }
}
