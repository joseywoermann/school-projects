public class Zauberer extends Held {

    private int zauberkraft;

    /**
     * Konstruktor für Objekte der Klasse Zuaberer
     */
    public Zauberer(String pName, int pStaerke, int pLebenspunkte, Waffe pWaffe, int pZauberkraft) {
        super(pName, pStaerke, pLebenspunkte, pWaffe);
        if (pZauberkraft < 0) {
            throw new Error("Zauberkraft kann nicht weniger als 0 sein.");
        }
        this.zauberkraft = pZauberkraft;
    }

    /**
     * Setzt die Lebenspunkte zurück.
     */
    public void heilen() {
        this.lebenspunkte = this.sollLebenspunkte;
    }

    /**
     * Die Zauberkraft des Zauberers
     */
    public int getZauberkraft() {
        return this.zauberkraft;
    }
}
