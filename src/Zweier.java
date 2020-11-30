public class Zweier extends Ruderboote{

    // KLassenvariablen

    public final static String shape11 = "   / /   ";
    public final static String shape12 = "<--o-o-->";
    public final static String shape13 = "    \\ \\   ";

    public final static String shape21 = "   \\ \\   ";
    public final static String shape22 = "<--o-o-->";
    public final static String shape23 = "   / /   ";
    private static final int besatzung = 2;

    public Zweier(int ypos, int xpos, int gesleistung) {

        super(ypos, xpos, besatzung, gesleistung);
    }


    @Override
    public String getShape11() {
            return Zweier.shape11;
        }

    public String getShape12() {
        return Zweier.shape12;
    }

    public String getShape13() {
        return Zweier.shape13;
    }


    public String getShape21() {
        return Zweier.shape21;
    }

    public String getShape23() {
        return Zweier.shape23;
    }
}
