public class Teller extends Geschirr {
  
    private boolean tief;
  
    public Teller(int pDurchmesser, int pHoehe, int pGewicht, boolean pTief) {     
        super(pDurchmesser, pHoehe, pGewicht);
        this.tief = pTief;
    }

    public void stapeln() {
        // ...
    }

    public void nahrungAufnehmen(String pNahrung) {
        this.inhalt = pNahrung;
    }


    public boolean istTief() {
        return this.tief;
    }
}