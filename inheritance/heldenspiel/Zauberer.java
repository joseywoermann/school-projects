public class Zauberer extends Held {

    private int zauberkraft = 0;
    private int heilAnzahl  = 5;

    /**
     * Konstruktor für Objekte der Klasse Zuaberer
     */
    public Zauberer(String pName, int pStaerke, int pLebenspunkte, Waffe pWaffe, int pZauberkraft) {
        super(pName, pStaerke, pLebenspunkte, pWaffe);
        parameterValidieren(pZauberkraft);
        this.zauberkraft = pZauberkraft;
    }

    /**
     * Setzt die Lebenspunkte zurück.
     */
    public void heilen() {
        if (this.heilAnzahl > 0) {
            this.lebenspunkte = this.sollLebenspunkte;
            this.heilAnzahl--;
        } else {
            System.out.println("Zauberer können sich nur 5 mal heilen.");
        }
    }

    /**
     * Die Zauberkraft des Zauberers
     */
    public int getZauberkraft() {
        return this.zauberkraft;
    }

    /**
     * Überprüft, ob alle Parameter gültig sind.
     */
    private void parameterValidieren(int pZauberkraft) {
        if (pZauberkraft <= 0) {
            throw new Error("Zauberkraft muss größer als 0 sein.");
        }
    }
}
