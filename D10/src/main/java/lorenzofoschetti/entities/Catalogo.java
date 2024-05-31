package lorenzofoschetti.entities;

import java.util.Date;

public abstract class Catalogo {
    //attributi
    int codiceibsn;
    String titolo;
    Date dataPubblicazione;
    int pagine;

    //costruttore
    public Catalogo(int codiceibsn, String titolo, Date dataPubblicazione, int pagine) {
        this.codiceibsn = codiceibsn;
        this.titolo = titolo;
        this.dataPubblicazione = dataPubblicazione;
        this.pagine = pagine;


    }

    //getter e setter
    public int getCodiceibsn() {
        return codiceibsn;
    }

    public void setCodiceibsn(int codiceibsn) {
        this.codiceibsn = codiceibsn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(Date dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "codiceibsn=" + codiceibsn +
                ", titolo='" + titolo + '\'' +
                ", dataPubblicazione=" + dataPubblicazione +
                ", pagine=" + pagine +
                '}';
    }
}
