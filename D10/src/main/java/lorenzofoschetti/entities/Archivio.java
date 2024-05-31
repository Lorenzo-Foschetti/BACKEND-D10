package lorenzofoschetti.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Archivio {
    List<Catalogo> listaCataloghi;
    List<Libro> listaLibri;


    public Archivio(List<Catalogo> listaCataloghi, List<Libro> listaLibri) {

        this.listaCataloghi = new ArrayList<>();
        this.listaLibri = new ArrayList<>();
    }


    public List<Catalogo> getListaCataloghi() {
        return listaCataloghi;
    }

    public void setListaCataloghi(List<Catalogo> listaCataloghi) {
        this.listaCataloghi = listaCataloghi;
    }

    public List<Libro> getListaLibri() {
        return listaLibri;
    }

    public void setListaLibri(List<Libro> listaLibri) {
        this.listaLibri = listaLibri;
    }

    @Override
    public String toString() {
        return "Archivio{" +
                "listaCataloghi=" + listaCataloghi +
                '}';
    }

    //metodo per aggiungere un prodotto alla mia listaCataloghi
    public void aggiungiProdotto(Catalogo catalogo) {
        this.getListaCataloghi().add(catalogo);
    }

    //metodo per rimuovere in base all codice ibsn

    public void rimuoviProdottoIbsn(String ibsn) {
        if (this.getListaCataloghi().isEmpty()) {
            System.out.println("Non abbiamo trovato il codice desiderato");
        } else {
            List<Catalogo> listaIbsn = this.getListaCataloghi().stream()
                    .filter(prodotto -> Objects.equals(prodotto.getCodiceibsn(), ibsn))
                    .toList();

            if (listaIbsn.isEmpty()) {
                System.out.println("Niente da eliminare");
            } else {

                listaIbsn.forEach(prodotto -> this.getListaCataloghi().remove(prodotto));

            }
        }
    }

    //metodo per ricercare in base al codice ibsn
    public void ricercaProdttoIbsn(String ibsn) {
        if (this.getListaCataloghi().isEmpty()) {
            System.out.println("Non abbiamo trovato il codice desiderato");
        } else {
            List<Catalogo> listaIbsn2 = this.getListaCataloghi().stream()
                    .filter(prodotto -> Objects.equals(prodotto.getCodiceibsn(), ibsn))
                    .toList();

            if (listaIbsn2.isEmpty()) {
                System.out.println("Nessun elemento trovato");
            } else {

                listaIbsn2.forEach(prodotto -> System.out.println(prodotto.getTitolo()));
            }
        }
    }

    //ricerca per anno di pubblicazione
    public void ricercaProdottoAnno(int dataDiPubblicazione) {
        if (this.getListaCataloghi().isEmpty()) {
            System.out.println("Non abbiamo trovato nulla per questo anno");
        } else {
            List<Catalogo> listaAnno = this.getListaCataloghi().stream()
                    .filter(prodotto -> Objects.equals(prodotto.getDataPubblicazione(), dataDiPubblicazione))
                    .toList();

            if (listaAnno.isEmpty()) {
                System.out.println("Nessun elemento trovato per questo anno");
            } else {
                listaAnno.forEach(prodotto -> System.out.println(prodotto.getTitolo()));
            }
        }
    }


    //ricerca per autore
    public void ricercaProdottoAutore(String autore) {
        if (this.getListaLibri().isEmpty()) {
            System.out.println("Non abbiamo trovato nessun libro per questo autore");
        } else {
            List<Libro> listaAutore = this.getListaLibri().stream()
                    .filter(prodotto -> Objects.equals(prodotto.getAutore(), autore))
                    .toList();

            if (listaAutore.isEmpty()) {
                System.out.println("Nessun libro trovato con questo autore");
            } else {
                listaAutore.forEach(prodotto -> System.out.println(prodotto.getTitolo()));
            }
        }
    }

}


