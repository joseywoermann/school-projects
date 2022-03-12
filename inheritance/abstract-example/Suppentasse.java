public class Suppentasse extends Tasse {

    public Suppentasse(int pDurchmesser, int pHoehe, int pGewicht) {
        super(pDurchmesser, pHoehe, pGewicht);
    }

    public void nahrungAufnehmen(String pNahrung) {
        this.inhalt = pNahrung;
    }
}
