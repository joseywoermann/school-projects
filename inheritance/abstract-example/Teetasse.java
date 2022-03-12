public class Teetasse extends Tasse {

    /**
     * Erstellt eine neue Teetasse
     * @param pDurchmesser
     * @param pHoehe
     * @param pGewicht
     */
    public Teetasse(int pDurchmesser, int pHoehe, int pGewicht) {
        super(pDurchmesser, pHoehe, pGewicht);
    }

    /**
     * Nimmt ein Getränk auf
     * @param pGetraenk
     */
    public void getraenkAufnehmen(String pGetraenk) {
        this.inhalt = pGetraenk;
    }
}
