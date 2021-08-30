public class Held {

    protected String    name;
    protected int       staerke;
    protected int       angriffspunkte;
    protected int       lebenspunkte;
    protected Waffe     waffe;

    protected int       sollLebenspunkte;

    /**
     * Konstruktor für Objekte der Klasse Held.
     */
    public Held(String pName, int pStaerke, int pAngriffspunkte, int pLebenspunkte, Waffe pWaffe) {
        this.name = pName;
        this.staerke = pStaerke;
        this.angriffspunkte = pAngriffspunkte;
        this.lebenspunkte = pLebenspunkte;
        this.waffe = pWaffe;

        this.sollLebenspunkte = pLebenspunkte;
    }

    /**
     * Greift ein Monster an.
     */
    public void angreifen(Monster pGegner, Kampfregel pRegel) {
        // kämpfen
    }

    /**
     * Berechnet den Angriffswert.
     */
    public int angriffswertBerechnen() {
        // berechnen
    }
}
