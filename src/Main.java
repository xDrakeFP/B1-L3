//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import entities.Chiamata;
import entities.Rettangolo;
import entities.SIM;
import entities.Chiamata;
import static entities.Rettangolo.stampaDueRettangoli;

public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(15, 11);
        Rettangolo r2 = new Rettangolo(10, 12);

        r1.stampaRettangolo();
        r2.stampaRettangolo();
        stampaDueRettangoli(r1,r2);

        System.out.println("------");

        SIM sim1 = new SIM("3331234567");
        sim1.stampaDati();

        System.out.println("------");

        SIM sim2 = new SIM("3459876543");
        sim2.credito = 12.30;
        sim2.chiamate[0] = new Chiamata("3201122334", 10);
        sim2.chiamate[1] = new Chiamata("3334445556", 10);
        sim2.chiamate[2] = new Chiamata("3334445556", 10);
        sim2.chiamate[3] = new Chiamata("3334445556", 10);
        sim2.chiamate[4] = new Chiamata("3334445556", 10);
        sim2.stampaDati();


        }
    }
