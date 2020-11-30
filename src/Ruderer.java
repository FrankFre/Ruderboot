import java.util.Random;

public class Ruderer {

    Random zufall = new Random();

    //Instanzvariable
    private int leistung;

    //Getter & Setter
    public int getLeistung() {
        return this.leistung;
    }

    /* Konstruktor */
    public Ruderer() {
        this.leistung = zufall.nextInt(100) + 400;;

    }
}
