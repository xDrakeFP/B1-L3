package entities;

public class SIM {

    // Attributi
    String numero;
    public Double credito;
public Chiamata[] chiamate;

public SIM(String numero) {
    this.numero = numero;
    this.credito = 0.0;
    this.chiamate = new Chiamata[5];
}

public void stampaDati() {
    System.out.println("Numero : "+this.numero);
    System.out.println("Credito : "+this.credito+" €");
    if (this.chiamate[0]==null)
    {
        System.out.println("Nessuna chiamata in elenco");
    } else
    {
    System.out.println("Elenco Chiamate :");
        for (int i = 0; i < this.chiamate.length; i++) {
            System.out.println("Chiamata " + i + ": " + this.chiamate[i].numeroChiamato + " durata : " + this.chiamate[i].minuti);
        }
    }
}

}
