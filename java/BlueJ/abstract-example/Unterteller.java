public class Unterteller extends Geschirr {

    private Tasse tasse;
    
    /**
     * Erstellt einen neuen Unterteller
     * @param pDurchmesser
     * @param pHoehe
     * @param pGewicht
     */
    public Unterteller(int pDurchmesser, int pHoehe, int pGewicht) {
        super(pDurchmesser, pHoehe, pGewicht);
    }

    /**
     * Stapelt Unterteller
     */
    public void stapeln() {
        // ...
    }

    /**
     * Nimmt eine Tasse auf
     * @param pTasse
     */
    public void tasseAufnehmen(Tasse pTasse) {
        this.tasse = pTasse;
    }

    /**
     * Gibt die Tasse zurück
     * @return Tasse
     */
    public Tasse getTasse() {
        return this.tasse;
    }
}