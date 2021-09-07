public class Monster {

    private int angriffswert = 0;
    private int lebenspunkte = 0;

    /**
     * Konstruktor für Objekte der Klasse Monster
     */
    public Monster(int pAngriffswert, int pLebenspunkte) {
        if (pAngriffswert <= 0 || pLebenspunkte <= 0) {
            throw new Error("Lebenspunkte oder Angriffswert müssen größer als 0 sein.");
        }
        this.angriffswert = pAngriffswert;
        this.lebenspunkte = pLebenspunkte;
    }

    /**
     * Reduziert die Lebenspunkte um 1
     */
    public void lebenspunkteReduzieren() {
        if ((this.lebenspunkte - 1) < 0) {
            System.out.println("Monster ist tot, Held hat gewonnen.");
        }
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
