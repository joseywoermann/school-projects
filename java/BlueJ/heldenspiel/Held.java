public class Held {

    protected String    name                = null;
    protected int       staerke             = 0;
    protected int       angriffswert        = 0;
    protected int       lebenspunkte        = 0;
    protected Waffe     waffe               = null;

    protected int       sollLebenspunkte    = 0;

    /**
     * Konstruktor für Objekte der Klasse Held.
     */
    public Held(String pName, int pStaerke, int pLebenspunkte, Waffe pWaffe) {
        if (pStaerke < 0 || pLebenspunkte < 0) {
            throw new Error("Lebenspunkte oder Stärke können nicht weniger als 0 sein.");
        }

        this.name               = pName;
        this.staerke            = pStaerke;
        this.lebenspunkte       = pLebenspunkte;
        this.waffe              = pWaffe;
        this.sollLebenspunkte   = pLebenspunkte;
        this.angriffswert       = angriffswertBerechnen();
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
        // stärke und schadensbonus der waffe
        return (this.staerke * this.waffe.getBonus());
    }
}
