
public class Testprogramm {

    public static void main(String[] args) throws InterruptedException {

        /* Initialwerte für Simulation */
        int anzboote = 3;              // zwei 4-er Boote
        int besatzung = 2;              // Besatzung pro Boot
        int distanz = 150;


        Simulation rennen = new Simulation(anzboote, besatzung, distanz);

        rennen.booteGenerieren(anzboote, besatzung);

        rennen.wettkampf();

    }

//    private static void falscheEingabe() {
//        sc.close();
//        throw new IllegalArgumentException("Ungültige Eingabe");
//    }

}
