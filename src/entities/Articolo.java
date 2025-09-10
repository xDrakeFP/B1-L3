package entities;

public class Articolo {
    // Attributi

    public int codiceArticolo;
    public String descrizione;
    public double prezzo;
    public int quantita;


    // Costruttore
    public Articolo(int codiceArticolo,String descrizione,double prezzo,int quantita){
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    // Metodi

}
