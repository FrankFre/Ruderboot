public class Vierer extends Ruderboote {

    // KLassenvariablen

    public final static String shape11 = "   / / / /";
    public final static String shape12 = "<--o-o-o-o-->";
    public final static String shape13 = "    \\ \\ \\ \\";
    public final static String shape21 = "  \\ \\ \\ \\";
    public final static String shape23 = "  / / / /";

    private static final int besatzung = 4;


    public Vierer(int ypos, int xpos, int gesleistung) {

        super(ypos, xpos, besatzung, gesleistung);
    }

    @Override
    public String getShape11() {
        return Vierer.shape11;
    }

    public String getShape12() {
        return Vierer.shape12;
    }

    public String getShape13() {
        return Vierer.shape13;
    }

    public String getShape21() {
        return Vierer.shape21;
    }

    public String getShape23() {
        return Vierer.shape23;
    }

}

