public class Krieger extends Held {

    private int ausdauer = 0;

    /**
     * Konstruktor für Objekte der Klasse Krieger
     */
    public Krieger(String pName, int pStaerke, int pLebenspunkte, Waffe pWaffe, int pAusdauer) {
        super(pName, pStaerke, pLebenspunkte, pWaffe);

        parameterValidieren(pAusdauer);
        this.ausdauer = pAusdauer;
        this.angriffswert *= this.ausdauer;
    }

    /**
     * Die Ausdauer des Kriegers
     */
    public int getAusdauer() {
        return this.ausdauer;
    }

    /**
     * Überprüft, ob alle Parameter gültig sind.
     */
    private void parameterValidieren(int pAusdauer) {
        if (pAusdauer <= 0) {
            throw new Error("Ausdauer muss größer als 0 sein.");
        }
    }
}
