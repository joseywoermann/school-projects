public abstract class Geschirr {
    protected int       durchmesser;
    protected int       hoehe;
    protected int       gewicht;
    protected String    inhalt;

    /**
     * Eine abstrakte Klasse
     * @param pDurchmesser
     * @param pHoehe
     * @param pGewicht
     */
    public Geschirr(int pDurchmesser, int pHoehe, int pGewicht) {
        this.durchmesser = pDurchmesser;
        this.hoehe = pHoehe;
        this.gewicht = pGewicht;
    }

    /**
     * Diese Methode soll von Unterklassen implementiert werden.
     */
    protected abstract void stapeln();

    /**
     * Gibt den Durchmesser des Geschirrs zurück
     * @return int
     */
    public int getDurchmesser() {
        return this.durchmesser;
    }

    /**
     * Gibt die Höhe des Geschirrs zurück
     * @return int
     */
    public int getHoehe() {
        return this.hoehe;
    }

    /**
     * Gibt das Gewicht des Geschirrs zurück
     * @return int
     */
    public int getGewicht() {
        return this.gewicht;
    }

    /**
     * Gibt den Inhalt des Geschirrs zurück
     * @return String
     */
    public String getInhalt() {
        return this.inhalt;
    }
}
