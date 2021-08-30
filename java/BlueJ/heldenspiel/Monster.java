public class Monster {

    private int angriffswert;
    private int lebenspunkte;

    /**
     * Konstruktor für Objekte der Klasse Monster
     */
    public Monster(int pAngriffswert, int pLebenspunkte) {
        this.angriffswert = pAngriffswert;
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
