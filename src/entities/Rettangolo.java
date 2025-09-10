
package entities;

public class Rettangolo {

    // Attributi
    public double altezza;
    public double base;


    // Costruttore
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
}
    // Metodi

    public double getPerimeter() {
        return (altezza + base)*2;
    }

    public double getArea() {
        return base*altezza;
    }

    public void stampaRettangolo(){
        System.out.println("Il perimetro è :"+this.getPerimeter());
        System.out.println("L'area è :"+this.getArea());
    }

    public static void stampaDueRettangoli (Rettangolo r1,Rettangolo r2){
        System.out.println("Primo rettanbolo: Perimetro - "+r1.getPerimeter()+" Area - "+r1.getArea());
        System.out.println("Secondo rettanbolo: Perimetro - "+r2.getPerimeter()+" Area - "+r2.getArea());
        System.out.println("Somma delle due aree = "+(r1.getArea()+r2.getArea()));
        System.out.println("Somma dei due perimetri = "+(r1.getPerimeter()+r2.getPerimeter()));



    }

}
