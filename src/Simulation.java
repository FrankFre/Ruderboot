import java.util.Random;

public class Simulation {

    //Klassenvariablen
    private final int anzboote;
    private static int besatzung;
    private final int distanz;
    int summeleist;

    //Array vom Typ Ruderboote
    private Ruderboote[] boote;
    private Simulation simulation;


    public static int getBesatzung() {
        return besatzung;
    }

    // Konstruktor Simulation
    public Simulation(int anzboote, int besatzung, int distanz) {
        this.anzboote = anzboote;
        this.besatzung = besatzung;
        this.distanz = distanz;
    }

    public void booteGenerieren(int anzboote, int besatzung) {

        // Array vom Typ Boote mit der Anzahl Boote generieren
        this.boote = new Ruderboote[this.anzboote];
        // System.out.println(this.anzahlb);

        // Schleife für die Generierung der Boote
        for (int i = 0; i < anzboote; i++) {
            int zeile = 3;

            switch (besatzung) {
                case 2:
                    boote[i] = new Zweier(zeile, 4, 0);
                    break;

                case 4:
                    boote[i] = new Vierer(zeile, 4, 0);
                    break;
            }
            zeile = zeile + 4;
        }

        // Schleife für die Generierung der Ruderer
        for (int j = 0; j < anzboote; j++) {

            for (int y = 0; y < besatzung; y++) {

                Ruderer ruderer = new Ruderer();

                summeleist = boote[j].getGesleistung();
//                    System.out.println("Leistung Summe 1: " + summeleist);

                summeleist = summeleist + ruderer.getLeistung();
//                        System.out.println("Leistung Summe 2: " + summeleist);

                boote[j].setGesleistung(summeleist);
//                        System.out.println("Leistung nach Set: " + boote[0].getGesleistung());


            }
            System.out.println("Leistung des Bootes " + j + ":  " + boote[j].getGesleistung());
        }
    }

    public void wettkampf() throws InterruptedException {

        //rennen ausgeben
        while (true) {
            Thread.sleep(300);
            for (int j = 0; j < anzboote; j++) {     //Zeilen der Rennsimulation
                System.out.println();
                for (int k = 0; k < distanz; k++) {

                    if (k == boote[j].getXpos()) {
                        System.out.println(boote[j].getShape11());
                        System.out.println(boote[j].getShape12());
                        System.out.println(boote[j].getShape13());
                    } else     System.out.print(" ");
                }
            }
            Thread.sleep(300);
            for (int j = 0; j < anzboote; j++) {     //Zeilen der Rennsimulation
                System.out.println();
                for (int k = 0; k < distanz; k++) {

                    if (k == boote[j].getXpos()) {
                        System.out.println(boote[j].getShape21());
                        System.out.println(boote[j].getShape12());
                        System.out.println(boote[j].getShape23());
                        //     System.out.println("|");
                    }  else     System.out.print(" ");
                }
              bootBewegen(j);
           }
        }
    }

    private void bootBewegen(int j) {
        float bewegung = 0;
//
//        System.out.println((float)boote[j].getGesleistung());
//        System.out.println((float)Simulation.getBesatzung());
        System.out.println("x Position von Boot " + j + " " + boote[j].getXpos());


        bewegung = (((float)boote[j].getGesleistung() / (float) getBesatzung()) - 400) / 10;

        bewegung = bewegung + boote[j].getXpos();
        boote[j].setXpos((int)bewegung);

        System.out.println("neuer x- Wert: " + bewegung);
    }

    public int getDistanz() {
        return distanz;
    }

    public int getBoote() {
        return this.anzboote;
    }

}
