public class Vierer extends Ruderboote {

    // KLassenvariablen

    public final static String shape11 = "     /  /    ";
    public final static String shape12 = "<--o-o-o-o-->";
    public final static String shape13 = "   \\     \\   ";

    public final static String shape21 = "     \\  \\      ";

    public final static String shape23 = "   /     /   ";

    public Vierer(int ypos, int xpos, int gesleistung) {

        super(ypos, xpos, gesleistung);
    }

    @Override
    public String getShape11() {

        return Zweier.shape11;

    }
}
