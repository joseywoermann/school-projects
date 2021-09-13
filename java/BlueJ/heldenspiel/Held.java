public class Held {

    protected String    name                = null;
    protected int       staerke             = 0;
    protected int       angriffswert        = 0;
    protected int       lebenspunkte        = 0;
    protected int       sollLebenspunkte    = 0;
    protected Waffe     waffe               = null;

    /**
     * Konstruktor für Objekte der Klasse Held.
     */
    public Held(String pName, int pStaerke, int pLebenspunkte, Waffe pWaffe) {

        parameterValidieren(pName, pStaerke, pLebenspunkte, pWaffe);

        this.name               = pName;
        this.staerke            = pStaerke;
        this.lebenspunkte       = pLebenspunkte;
        this.sollLebenspunkte   = pLebenspunkte;
        this.waffe              = pWaffe;
        this.angriffswert       = angriffswertBerechnen();
    }

    /**
     * Greift ein Monster an.
     */
    public void angreifen(Monster pGegner) {
        Kampfregel.kampf(this, pGegner);
    }

    /**
     * Überprüft, ob alle Parameter gültig sind.
     */
    private void parameterValidieren(String pName, int pStaerke, int pLebenspunkte, Waffe pWaffe) {
        if (pName == null) {
            throw new Error("Jeder Held benötigt einen Namen.");
        }
        if (pStaerke <= 0) {
            throw new Error("Stärke muss größer als 0 sein.");
        }
        if (pLebenspunkte <= 0) {
            throw new Error("Lebenspunkte müssen größer als 0 sein.");
        }
        if (pWaffe == null) {
            throw new Error("Jeder Held benötigt eine Waffe.");
        }
    }

    /**
     * Berechnet den Angriffswert des Helden.
     * Die Stärke wird mit dem Bonus der Waffemultipliziert, um das Ergebnis zu errechnen.
     */
    public int angriffswertBerechnen() {
        return (this.staerke * this.waffe.getBonus());
    }

    /**
     * Gibt die lebenspunkte des Helden zurück
     */
    public int getLebenspunkte() {
        return this.lebenspunkte;
    }

    /**
     * Reduziert die Lebenspunkte um 1.
     */
    public void lebenspunkteReduzieren() {
        this.lebenspunkte--;
    }
}
