package lorenzofoschetti.entities;

import java.util.Date;

public class Libro extends Catalogo {
    //attributi
    String autore;
    String genere;

    //costruttore
    public Libro(int codiceibsn, String titolo, Date dataPubblicazione, int pagine) {
        super(codiceibsn, titolo, dataPubblicazione, pagine);
    }

    //getter e setter
    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", codiceibsn=" + codiceibsn +
                ", titolo='" + titolo + '\'' +
                ", dataPubblicazione=" + dataPubblicazione +
                ", pagine=" + pagine +
                '}';
    }
}
