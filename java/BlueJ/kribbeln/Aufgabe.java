    public class Aufgabe {

    private String aufgabenstellung;
    private String[] aufgabe;
    private int zahl;

    // Eine Aufgabenstellung ist ein Array, in dem die Position eines Elements
    // bestimmt, wie es interpretiert werden soll
    // { <welche farbe> <anzahl> <gleich / unterschiedlich> <Aufgabenstellung> }
    private String[][] aufgaben = {
        {
            "rot",
            "1",
            "unterschiedlich",
            "Würfele mindestens einmal rot."
        },
        {
            "blau",
            "3",
            "gleich",
            "Würfele dreimal blau"
        },
        {
            "egal",
            "2",
            "gleich",
            "Würfele mindestens zweimal die gleiche Farbe."
        }
    };

    /**
     * Constructor for objects of class Aufgabe
     */
    public Aufgabe() {
        // Nichts notwendig
    }


    // Zufällige Aufgabe ausgeben
    public String zufallsAufgabeGenerieren() {
        zahl = (int)Math.round(Math.random() * (2 - 0));
        aufgabenstellung = aufgaben[zahl][3];
        aufgabe = aufgaben[zahl];

        return aufgabenstellung;
    }

    // Auswerten, ob der Spieler die Aufgabe erfüllt hat
    public void aufgabeAuswerten(String[] pSpielerdaten) {

    }

}
