public class Spieler {

    private int punktestand = 0;
    private int platzierung = 0;
    private int augenzahl = 0;
    private String[] aufgabenDaten = {}; // Was gewürfelt wurde etc.
    private String aufgabenstellung = null;
    private String ergebnis = null;

    private Spieler gegner;
    private Aufgabe aufgabe;
    private Wuerfel wuerfel1;
    private Wuerfel wuerfel2;
    private Wuerfel wuerfel3;


    /**
     * Constructor for objects of class Spieler
     */
    public Spieler(Aufgabe pAufgabe, Wuerfel pWuerfel1, Wuerfel pWuerfel2, Wuerfel pWuerfel3) {
        this.aufgabe = pAufgabe;
        this.wuerfel1 = pWuerfel1;
        this.wuerfel2 = pWuerfel2;
        this.wuerfel3 = pWuerfel3;
    }

    public void gegnerFestlegen(Spieler pGegner) {
        this.gegner = pGegner;
    }

    // Aufgabe "aussuchen" udn starten
    public void aufgabeStarten() {
        this.aufgabenstellung = aufgabe.zufallsAufgabeGenerieren();
        System.out.println(this.aufgabenstellung);
    }

    // Prüfen, welcher Spieler mehr Punkte hat, und die Platzierungen anpassen
    public void platzierungBerechnen() {
        if (gegner.getPunktestand() < this.punktestand) {
            this.platzierung = 1; // Dieser Spieler hat mehr Punkte
            gegner.setPlatzierung(2)

        } else if (gegner.getPunktestand() == this.punktestand) {
            this.platzierung = 1; // Beide haben gleich viele Punkte
            gegner.setPlatzierung(1)

        } else {
            this.platzierung = 2; // Dieser Spieler hat weniger Punkte
            gegner.setPlatzierung(1)
        }
    }


    public int getPunktestand() {
        return this.punktestand
    }


    public void setPlatzierung(int pPunkte) {
        if (pPunkte == 1 || pPunkte == 2) {
            this.platzierung = pPunkte;
        }
    }

}
