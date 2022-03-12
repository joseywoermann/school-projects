public class Glas extends Geschirr {
  
    public Glas(int pDurchmesser, int pHoehe, int pGewicht) {
        super(pDurchmesser, pHoehe, pGewicht);
    }

    public void stapeln() {
        // ...
    }

    public void getraenkAufnehmen(String pGetraenk) {
        this.inhalt = pGetraenk;
    }
}