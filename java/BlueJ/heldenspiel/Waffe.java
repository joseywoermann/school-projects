public class Waffe {

    private int     bonus       = 0;
    private String  material    = null;
    private int     magie       = 0;

    /**
     * Konstruktor für Objekte der Klasse Waffe
     */
    public Waffe(int pBonus, String pMaterial, int pMagie) {
        // Instanzvariable initialisieren
        this.bonus      = pBonus;
        this.material   = pMaterial;
        this.magie      = pMagie;
    }

    /**
     * Berechnet den Bonus der Waffe.
     *
     * @return        der berechnete Bonus der Waffe
     */
    public int bonusBerechnen() {
        int berechneterBonus = 0; // Material & Magie verrechnen
        return berechneterBonus;
    }
}
