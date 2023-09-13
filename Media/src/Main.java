import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        NotasAluno notasAluno = new NotasAluno();
        notasAluno.setNota1(pedirNota(1));
        mandarMensagem("\033[H\033[2J");
        notasAluno.setNota2(pedirNota(2));
        notasAluno.setNota3(pedirNota(3));
        notasAluno.setFaltas(pedirFaltas());

        Boletim boletim = new Boletim();
        Resultado resultado = boletim.processar(notasAluno);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String novaMedia = decimalFormat.format(resultado.getMedia());

        mandarMensagem("Média do aluno: " + novaMedia);
        mandarMensagem("Situação do aluno: " + resultado.getSituacao());

    }

    private static void mandarMensagem(String msg){
        System.out.println(msg);
    }

    private static double pedirNota(int nota){

        mandarMensagem("Digite a " + nota + "° do aluno: ");
        return sc.nextDouble();

    }

    private static int pedirFaltas(){
        mandarMensagem("Digite a quantidade de faltas do aluno: ");
        return sc.nextInt();
    }

}