package lorenzofoschetti.entities;

import java.util.List;

public class Archivio {
    List<Catalogo> listaCataloghi;


    public Archivio(List<Catalogo> listaCataloghi) {
        this.listaCataloghi = listaCataloghi;
    }

    public static void main(String[] args) {

    }

    public List<Catalogo> getListaCataloghi() {
        return listaCataloghi;
    }

    public void setListaCataloghi(List<Catalogo> listaCataloghi) {
        this.listaCataloghi = listaCataloghi;
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
}
