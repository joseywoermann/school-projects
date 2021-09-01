public class Waffe {

    private int     bonus       = 0;
    private String  material    = null;
    private int     magie       = 0;

    private String[] materialWerte = {
        "Bambus",       // 1
        "Holz",         // 2
        "Stein",        // 3
        "Aluminium",    // 4
        "Eisen"         // 5
    };

    /**
     * Konstruktor für Objekte der Klasse Waffe
     */
    public Waffe(String pMaterial, int pMagie) {

        // prüfen, ob das Material gültig ist
        materialUeberpruefen(pMaterial);

        this.material   = pMaterial;
        this.magie      = pMagie;

        this.bonus = bonusBerechnen();
    }

    /**
     * Berechnet den Bonus der Waffe.
     */
    public int bonusBerechnen() {
        int tmpBonus = 0;

        for (int i = 0; i < materialWerte.length; i++) {
            if (materialWerte[i] == this.material) {
                tmpBonus = (i + 1);
            }
        }
        return (tmpBonus * this.magie);
    }

    /**
     * Bonus der Waffe
     */
    public int getBonus() {
        return this.bonus;
    }

    /**
     * Überprüft, ob das Material verwendet werden kann
     */
    private void materialUeberpruefen(String pMaterial) {
        boolean gueltigesMaterial = false;
        for (int i  = 0; i < materialWerte.length; i++) {
            if (materialWerte[i] == pMaterial) {
                gueltigesMaterial = true;
                break;
            }
        }
        if (gueltigesMaterial == false) {
            throw new Error("Ungültiges Material. | Mögliche Materiale: 'Bambus', 'Holz', 'Stein', 'Aluminium', 'Eisen'.");
        }
    }
}
