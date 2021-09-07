public class Held {

    protected String    name                = null;
    protected int       staerke             = 0;
    protected int       angriffswert        = 0;
    protected int       lebenspunkte        = 0;
    protected int       sollLebenspunkte    = 0;
    protected Waffe     waffe               = null;

    /**
     * Konstruktor für Objekte der Klasse Held.
     */
    public Held(String pName, int pStaerke, int pLebenspunkte, Waffe pWaffe) {
        if (pStaerke <= 0 || pLebenspunkte <= 0) {
            throw new Error("Lebenspunkte oder Stärke müssen größer als 0 sein.");
        }

        this.name               = pName;
        this.staerke            = pStaerke;
        this.lebenspunkte       = pLebenspunkte;
        this.sollLebenspunkte   = pLebenspunkte;
        this.waffe              = pWaffe;
        this.angriffswert       = angriffswertBerechnen();
    }

    /**
     * Greift ein Monster an.
     * Die Partei mit dem höchsten Angriffswert gewinnt.
     * Helden können ihren AW mithilfe einer Waffe steigern.
     */
    public void angreifen(Monster pGegner) {
        if (pGegner.getAngriffswert() > this.angriffswert) { // Monster gewinnt
            this.lebenspunkteReduzieren();
        } else if (pGegner.getAngriffswert() < this.angriffswert) { // Spieler gewinnt
            pGegner.lebenspunkteReduzieren();
        }
    }

    /**
     * Berechnet den Angriffswert.
     */
    public int angriffswertBerechnen() {
        // Stärke und Schadensbonus der Waffe
        return (this.staerke * this.waffe.getBonus());
    }

    /**
     * Reduziert die Lebenspunkte um 1
     */
    public void lebenspunkteReduzieren() {
        if ((this.lebenspunkte - 1) < 0) {
            System.out.println("Held ist tot, Monster hat gewonnen.");
        }
        this.lebenspunkte--;
    }
}
