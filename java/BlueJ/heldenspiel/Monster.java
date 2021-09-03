public class Monster {

    private int angriffswert = 0;
    private int lebenspunkte = 0;

    /**
     * Konstruktor für Objekte der Klasse Monster
     */
    public Monster(int pAngriffswert, int pLebenspunkte) {
        if (pAngriffswert =< 0 || pLebenspunkte =< 0) {
            throw new Error("Lebenspunkte oder Angriffswert müssen größer als 0 sein.");
        }
        this.angriffswert = pAngriffswert;
        this.lebenspunkte = pLebenspunkte;
    }

    /**
     * Setzt die Lebenspunkte auf den angegebenen Integer. (Muss >= 0 sein)
     */
    public void setLebenspunkte(int pLebenspunkte) {
        if (pLebenspunkte =< 0) {
            throw new Error("Lebenspunkte muss größer als 0 sein.");
        }
        this.lebenspunkte = pLebenspunkte;
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
