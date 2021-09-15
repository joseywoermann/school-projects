public class Mueslischale extends Geschirr {
    
    /**
     * Erstellt eine neue Müslischale
     * @param pDurchmesser
     * @param pHoehe
     * @param pGewicht
     */
    public Mueslischale(int pDurchmesser, int pHoehe, int pGewicht) {
        super(pDurchmesser, pHoehe, pGewicht);
    }

    /**
     * Stapelt Müslischalen
     */
    public void stapeln() {
        // ...
    }
    
    /**
     * Nimmt Nahrung auf
     * @param pNahrung
     */
    public void nahrungAufnehmen(String pNahrung) {
        this.inhalt = pNahrung;
    }
}