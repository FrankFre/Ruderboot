public class Ruderboote {

    public static int getAnzboote;
    // Klassenvariablen
    private String shape11;
    private String shape12;
    private String shape13;
    private String shape21;
    private String shape23;

    private int besatzung;
    private final int ypos;
    private int xpos;
    int leistung;
    int gesleistung;

    /* Konstruktor */
    public Ruderboote(int ypos, int xpos, int besatzung, int gesleistung) {
        this.ypos = ypos;
        this.xpos = xpos;
        this.besatzung = besatzung;
        this.gesleistung = gesleistung;
    }



    // Getter und Setter
    public void setGesleistung(int gesleistung) {
        this.gesleistung = gesleistung;
        }

    public int getGesleistung() {
        return gesleistung;
        }
    public int getLeistung() {  return leistung;
    }

    public int getYpos() {
        return ypos;
    }
    public int getXpos() {
        return xpos;
    }

    public void setXpos(int xpos)  {
        this.xpos = xpos;
    }


    public String getShape11() {
        return shape11;
    }
    public String getShape12() {
        return shape12;
    }
    public String getShape13() {
        return shape13;
    }

    public String getShape21() {
        return shape21;
    }
    public String getShape23() {
        return shape23;
    }

    public int getBesatzung() {
        return besatzung;
    }
}
