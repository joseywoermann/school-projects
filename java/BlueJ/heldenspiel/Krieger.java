public class Krieger extends Held {

    private int ausdauer;

    /**
     * Konstruktor für Objekte der Klasse Krieger
     */
    public Krieger(String pName, int pStaerke, int pLebenspunkte, Waffe pWaffe, int pAusdauer) {
        super(pName, pStaerke, pLebenspunkte, pWaffe);
        if (pAusdauer < 0) {
            throw new Error("Ausdauer kann nicht weniger als 0 sein.");
        }
        this.ausdauer = pAusdauer;
    }

    /**
     * Den Angriffswert des Kriegers berechnen. (Berücksichtigt die Ausdauer)
     */
    public void angriffswertBerechnenMitAusdauer() {
        this.angriffswert = this.angriffswert * this.ausdauer;
    }

    /**
     * Die Ausdauer des Kriegers
     */
    public int getAusdauer() {
        return this.ausdauer;
    }
}
