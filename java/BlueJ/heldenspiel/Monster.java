public class Monster {

    private int angriffswert = 0;
    private int lebenspunkte = 0;

    /**
     * Konstruktor für Objekte der Klasse Monster
     */
    public Monster(int pAngriffswert, int pLebenspunkte) {
        parameterValidieren(pAngriffswert, pLebenspunkte);
        this.angriffswert = pAngriffswert;
        this.lebenspunkte = pLebenspunkte;
    }

    /**
     * Überprüft, ob alle Parameter gültig sind.
     */
    private void parameterValidieren(int pAngriffswert, int pLebenspunkte) {
        if (pAngriffswert <= 0) {
            throw new Error("Angriffswert muss größer als 0 sein.");
        }
        if (pLebenspunkte <= 0) {
            throw new Error("Lebenspunkte müssen größer als 0 sein.");
        }
    }

    /**
     * Reduziert die Lebenspunkte um 1
     */
    public void lebenspunkteReduzieren() {
        this.lebenspunkte--;
    }

    /**
     * Gibt den Angriffswert des Monsters zurück
     */
    public int getAngriffswert() {
        return this.angriffswert;
    }

    /**
     * Gibt die lebenspunkte des Monsters zurück
     */
    public int getLebenspunkte() {
        return this.lebenspunkte;
    }
}
