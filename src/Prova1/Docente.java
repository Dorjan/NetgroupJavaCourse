package Prova1;

public class Docente {

    String nome;
    String cognome;
    int matricola;

    public Docente (String name, String cognome, int matricola) {

        this.nome = name;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public int getMatricola() {
        return this.matricola;
    }

    public String toString() {
        return this.nome+" "+this.cognome+ " " +"matricola: "+this.matricola;
    }
}
