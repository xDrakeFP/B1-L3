package entities;

import java.util.Date;

public class Cliente {

    //Attributi
    public int codiceCliente;
    public String nome;
    public String cognome;
    public String email;

    // Costruttore

    public Cliente (int codiceCliente, String nome,String cognome, String email){
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    // Metodi
}
