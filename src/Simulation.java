import java.util.Random;

public class Simulation {

    //Klassenvariablen
    private final int anzahlBoote;
    private static int anzahlRuderer;
    private final int distanz;
    int summeleist;
    int bewegung;
    int k, j;

    private Ruderboote[] boote;
    private Simulation simulation;

    // Konstruktor Simulation
    public Simulation(int anzahlBoote, int anzahlRuderer, int distanz) {
        this.anzahlBoote = anzahlBoote;
        this.anzahlRuderer= anzahlRuderer;
        this.distanz = distanz;

        booteGenerieren(anzahlBoote, anzahlRuderer);
    }

    public void booteGenerieren(int anzboote, int anzahlRuderer) {
        this.boote = new Ruderboote[anzboote];

        int zeile = 3;                           // y- Offset für die Fahrspuren
        for (int i = 0; i < anzboote; i++) {    //Boote generieren

            switch (anzahlRuderer) {
                case 2:                              // Generierung der verschiedenen Bootstypen
                    boote[i] = new Zweier(zeile, 1, 0);
                    break;

                case 4:
                    boote[i] = new Vierer(zeile, 1, 0);
                    break;
            }

            for (int y = 0; y < anzahlRuderer; y++) {

                Ruderer ruderer = new Ruderer();
                summeleist = boote[i].getGesleistung();
                summeleist = summeleist + ruderer.getLeistung();
                boote[i].setGesleistung(summeleist);
            }
            System.out.println("Leistung des Bootes " + i + ":  " + boote[i].getGesleistung());
            zeile = zeile + 4;                       // y- Offset für die weiteren Boote
        }
    }

    public void wettkampf() throws InterruptedException {

        System.out.println();

        for (int a = 0; a < distanz; a++) {
            Thread.sleep(1000);
            System.out.println("Ruderbootrennen");
            System.out.println();

            for (j = 0; j < anzahlBoote; j++) {                 //alle Boote durchlaufen mit Shape 1

                for (k = 0; k <= boote[j].getXpos(); k++) {     // spaltenweiser Durchlauf für die Ausgabe der Boote
                    if (k != boote[j].getXpos())
                        System.out.print(" ");
                    else System.out.println(boote[j].getShape11());
                }
                for (k = 0; k <= boote[j].getXpos(); k++) {     // zeilenweiser Durchlauf dür die Ausgabe der Boote
                    if (k != boote[j].getXpos())
                        System.out.print(" ");
                    else System.out.println(boote[j].getShape12());
                }
                for (k = 1; k <= boote[j].getXpos(); k++) {     // zeilenweiser Durchlauf dür die Ausgabe der Boote
                    if (k != boote[j].getXpos())
                        System.out.print(" ");
                    else System.out.println(boote[j].getShape13());
                }
                System.out.println();
                bootBewegen(j);
            }

            //Ausgabe des zweiten Shape der Boote
            Thread.sleep(1000);
            System.out.println("Ruderbootrennen");
            System.out.println();

            for (j = 0; j < anzahlBoote; j++) {                //alle Boote durchlaufen mit Shape 2

                for (int k = 1; k <= boote[j].getXpos(); k++) {     // zeilenweiser Durchlauf für die Ausgabe der Boote
                    if (k != boote[j].getXpos()) {
                        System.out.print(" ");
                    } else System.out.println(boote[j].getShape21());
                }

                for (int k = 1; k <= boote[j].getXpos(); k++) {     // zeilenweiser Durchlauf dür die Ausgabe der Boote
                    if (k != boote[j].getXpos()) {
                        System.out.print(" ");
                    } else System.out.println(boote[j].getShape12());
                }

                for (int k = 1; k <= boote[j].getXpos(); k++) {     // zeilenweiser Durchlauf dür die Ausgabe der Boote
                    if (k != boote[j].getXpos()) {
                        System.out.print(" ");
                    } else System.out.println(boote[j].getShape23());
                }

                System.out.println("");
                bootBewegen(j);

            }
        }
    }

    public void bootBewegen(int j) {

        bewegung = (int) ((boote[j].getGesleistung() / boote[j].getAnzahlRuderer() - 400) / 25);

        bewegung = bewegung + boote[j].getXpos();
//        System.out.println("Bewegung: " + bewegung);

        boote[j].setXpos((int) bewegung);
//        System.out.println("neuer x- Wert: " + bewegung);

    }
    private int getAnzahlRuderer() {
        return anzahlRuderer;
    }
}

