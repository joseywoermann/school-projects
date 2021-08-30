public class Wuerfel {

    private int anzahlSeiten;

    /**
     * Konstruktor für Objekte der Klasse Wuerfel.
     */
    public Wuerfel(int pAnzahlSeiten) {
        this.anzahlSeiten = pAnzahlSeiten;
    }

    /**
     * Eine zufällige ganze Zahl zwischen 0 und der anzahl der Seiten generieren.
     */
    public int wuerfeln() {
        int zahl = (int)Math.round(Math.random() * (this.anzahlSeiten - 0));
        return zahl;
    }
}
