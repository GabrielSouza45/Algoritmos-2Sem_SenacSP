package src;

import java.util.Calendar;

public class Pessoa {
    private String nomeCompleto;
    private int anoNasc;


    public Pessoa() {

    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int idade(){

        return Calendar.getInstance().get(Calendar.YEAR) - anoNasc;

    }

    public String primeiroNome(){
        String[] nomes = this.nomeCompleto.split(" ");

        return nomes[0];
    }

    public String ultimoNome(){
        String[] nomes = this.nomeCompleto.split(" ");

        return nomes[nomes.length - 1];
    }
}
