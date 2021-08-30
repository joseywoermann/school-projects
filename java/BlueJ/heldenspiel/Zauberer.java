public class Zauberer extends Held {

    protected int zauberkraft;

    /**
     * Konstruktor für Objekte der Klasse Zuaberer
     */
    public Zauberer(String pName, int pStaerke, int pAngriffspunkte, int pLebenspunkte, Waffe pWaffe, int pZauberkraft) {
        super(pName, pStaerke, pAngriffspunkte, pLebenspunkte, pWaffe)
        this.zauberkraft = pZauberkraft;
    }

    /**
     * Setzt die Lebenspunkte zurück.
     */
    public void heilen() {
        this.lebenspunkte = this.sollLebenspunkte;
    }
}
