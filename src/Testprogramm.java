
public class Testprogramm {

    public static void main(String[] args) throws InterruptedException {

        // Initialwerte für Simulation
        int anzboote = 2;              // zwei 2-er Boote
        // Besatzung pro Boot
        int besatzung = 2;
        int distanz = 150;

        Simulation rennen = new Simulation(anzboote, besatzung, distanz);

        rennen.wettkampf();
    }

//    private static void falscheEingabe() {
//        sc.close();
//        throw new IllegalArgumentException("Ungültige Eingabe");
//    }

}
