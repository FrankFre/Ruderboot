import java.util.Random;

public class Ruderer {

    Random zufall = new Random();

    //Instanzvariable
    int leistung;

    public int getLeistung() {

        return this.leistung;
    }


    /* Konstruktor */
    public Ruderer() {
        this.leistung = zufall.nextInt(100) + 400;;

    }
}
