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
            "eins",
            "unterschiedlich",
            "Würfele mindestens einmal rot."
        },
        {
            "blau",
            "drei",
            "gleich",
            "Würfele dreimal blau"
        },
        {
            "egal",
            "zwei",
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
        this.aufgabe = aufgaben[zahl];

        return aufgabenstellung;
    }

    /**
     * Auswerten, ob der Spieler die Aufgabe erfüllt hat
     * @param pFarbe
     * @param pAnzahlFarbe
     */
    public void aufgabeAuswerten(String pFarbe, String[] pGewuerfelteFarben) {
      
      

      if (pFarbe == this.aufgabe[0] && pAnzahlFarbe == this.aufgabe[1]) {
        System.out.println("Du hast deine Aufgabe erfolgreich erfüllt, " + pAnzahlFarbe + " " + pFarbe + "e Felder.");
      } else {
        System.out.println("Du hast deine Aufgabe nicht erfüllt, du hattest " + pAnzahlFarbe + " " + pFarbe + "e Felder.");
      }
    }

}
