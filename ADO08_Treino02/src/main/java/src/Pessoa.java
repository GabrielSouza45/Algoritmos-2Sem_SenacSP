package src;

import java.util.Calendar;

public class Pessoa {
    private String nomeCompleto;
    private int anoNasc;

    private int idade;
    private String primeiroNome;
    private String ultimoNome;


    public Pessoa(String nomecompleto, int anoNasc) {

        this.nomeCompleto = nomecompleto;
        this.anoNasc = anoNasc;

        this.idade();
        this.primeiroNome();
        this.ultimoNome();


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


    public int getIdade() {
        return idade;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    private void idade(){

        this.idade = Calendar.getInstance().get(Calendar.YEAR) - anoNasc;

    }

    private void primeiroNome(){
        String[] nomes = this.nomeCompleto.split(" ");

        this.primeiroNome = nomes[0];
    }

    private void ultimoNome(){
        String[] nomes = this.nomeCompleto.split(" ");

        this.ultimoNome = nomes[nomes.length - 1];
    }
}
