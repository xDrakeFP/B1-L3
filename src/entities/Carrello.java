package entities;

import java.util.Arrays;

public class Carrello {
    // Attributi

    public Cliente cliente;
    public Articolo[] elencoArticoli;
    public double costoTotale;

    // Costruttore

    public Carrello (Cliente cliente, Articolo[] elencoArticoli, double costoTotale) {
        this.cliente = cliente;
        this.elencoArticoli = elencoArticoli;
        this.costoTotale = costoTotale;
    }

    // Metodi

}
