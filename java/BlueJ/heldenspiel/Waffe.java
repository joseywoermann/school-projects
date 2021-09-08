public class Waffe {

    private int     bonus       = 0;
    private String  material    = null;
    private int     magie       = 0;

    private String[] materialWerte = {
        "Bambus",       // Bonus: 1
        "Holz",         // Bonus: 2
        "Stein",        // Bonus: 3
        "Aluminium",    // Bonus: 4
        "Eisen"         // Bonus: 5
    };

    /**
     * Konstruktor für Objekte der Klasse Waffe
     */
    public Waffe(String pMaterial, int pMagie) {

        parameterValidieren(pMaterial, pMagie);

        this.material   = pMaterial;
        this.magie      = pMagie;
        this.bonus      = bonusBerechnen();
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
     * Überprüft, ob alle Parameter gültig sind.
     */
    private void parameterValidieren(String pMaterial, int pMagie) {
        if (pMagie <= 0) {
            throw new Error("Magie muss größer als 0 sein.");
        }
        if (materialUeberpruefen(pMaterial) == false) {
            throw new Error("Ungültiges Material.\nMögliche Materialien: 'Bambus', 'Holz', 'Stein', 'Aluminium', 'Eisen'.");
        }
    }

    /**
     * Überprüft, ob das Material verwendet werden kann
     */
    private boolean materialUeberpruefen(String pMaterial) {
        for (int i  = 0; i < materialWerte.length; i++) {
            if (materialWerte[i] == pMaterial) {
                return true;
            }
        }
        return false;
    }
}
