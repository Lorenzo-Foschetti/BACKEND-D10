package lorenzofoschetti.entities;

import lorenzofoschetti.enums.Periodicità;

import java.util.Date;

public class Rivista extends Catalogo {
    Periodicità periodicità;

    public Rivista(int codiceibsn, String titolo, Date dataPubblicazione, int pagine, Periodicità periodicità) {
        super(codiceibsn, titolo, dataPubblicazione, pagine);
        this.periodicità = periodicità;
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "periodicità=" + periodicità +
                ", codiceibsn=" + codiceibsn +
                ", titolo='" + titolo + '\'' +
                ", dataPubblicazione=" + dataPubblicazione +
                ", pagine=" + pagine +
                '}';
    }
}
