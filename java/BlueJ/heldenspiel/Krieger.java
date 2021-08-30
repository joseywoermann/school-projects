public class Krieger extends Held {

    protected int ausdauer;

    /**
     * Konstruktor für Objekte der Klasse Krieger
     */
    public Krieger(String pName, int pStaerke, int pAngriffspunkte, int pLebenspunkte, Waffe pWaffe, int pAusdauer) {
        super(pName, pStaerke, pAngriffspunkte, pLebenspunkte, pWaffe)
        this.ausdauer = pAusdauer;
    }
}
