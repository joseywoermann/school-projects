    public class Aufgabe {

    private String aufgabenstellung;
    private String[] aufgabe;
    private int zahl;
    private String zahlAlsText;
    private int textAlsZahl;
    private int anzahlWuerfeBenoetigteFarbe;

    private String[] aktuelleAufgabe;
    private String anzahlWuerfeBenoetigteFarbeString;

    /**
     * Eine Aufgabenstellung ist ein Array, in dem die Position eines Elements
     * bestimmt, wie es interpretiert werden soll
     * (<welche farbe> <anzahl> <gleich / unterschiedlich> <Aufgabenstellung>)
     */
    private String[][] aufgaben = {
        {
            "rot",
            "eins",
            "mindestens",
            "Würfele mindestens einmal rot."
        },
        {
            "blau",
            "drei",
            "gleich",
            "Würfele dreimal blau"
        },
        {
            "grün",
            "acht",
            "gleich",
            "Würfele achtmal grün"
        }/*,
        {         // prinzipiell möglich, aber kompliziert zu implementieren
            "egal",
            "zwei",
            "gleich",
            "Würfele mindestens zweimal die gleiche Farbe."
        }*/
    };

    /**
     * Constructor for objects of class Aufgabe
     */
    public Aufgabe() {
        // Nichts notwendig
    }


    // Zufällige Aufgabe ausgeben
    public String zufallsAufgabeAussuchen() {
      zahl = (int)Math.round(Math.random() * (1 - 0));
      aufgabenstellung = aufgaben[zahl][3];
      this.aufgabe = aufgaben[zahl];

      return aufgabenstellung;
    }

    /**
     * Auswerten, ob der Spieler die Aufgabe erfüllt hat
     * @param pAugenzahl int
     */
    public void aufgabeAuswerten(int pAugenzahl, int pBlau, int pGelb, int pGruen, int pRot, int pWeiss, int pSchwarz) {

      aktuelleAufgabe = this.aufgabe;
      anzahlWuerfeBenoetigteFarbeString = aktuelleAufgabe[0];
      //System.out.println(anzahlWuerfeBenoetigteFarbeString);

      switch (anzahlWuerfeBenoetigteFarbeString) {
        case "blau":
          anzahlWuerfeBenoetigteFarbe = pBlau;
          break;
        case "gelb":
          anzahlWuerfeBenoetigteFarbe = pGelb;
          break;
        case "grün":
          anzahlWuerfeBenoetigteFarbe = pGruen;
          break;
        case "rot":
          anzahlWuerfeBenoetigteFarbe = pRot;
          break;
        case "weiß":
          anzahlWuerfeBenoetigteFarbe = pWeiss;
          break;
        case "schwarz":
          anzahlWuerfeBenoetigteFarbe = pSchwarz;
          break;
        default:
          break;
      }
      //System.out.println(zahlZuString(anzahlWuerfeBenoetigteFarbe));

      if (anzahlWuerfeBenoetigteFarbe == stringZuZahl(aktuelleAufgabe[1])) {
        System.out.println("Du hast deine Aufgabe erfolgreich erfüllt,\ndu hattest " + anzahlWuerfeBenoetigteFarbe + " " + aktuelleAufgabe[0] + "e Felder.\nDie Augenzahl beträgt " + pAugenzahl + ".");
      } else {
        System.out.println("Du hast deine Aufgabe nicht erfüllt,\ndu hattest " + anzahlWuerfeBenoetigteFarbe + " " + aktuelleAufgabe[0] + "e Felder.\nDie Augenzahl beträgt " + pAugenzahl + ".");
      }
    }


    /**
     * Zahl zu String, da im Array nur Strings sind
     * @return String, weil Java statisch ist.
     */
    public String zahlZuString(int pZahl) {

      switch (pZahl) {
        case 1:
          zahlAlsText = "eins";
          break;
        case 2:
          zahlAlsText = "zwei";
          break;
        case 3:
          zahlAlsText = "drei";
          break;
        case 4:
          zahlAlsText = "vier";
          break;
        case 5:
          zahlAlsText = "fünf";
          break;
        case 6:
          zahlAlsText = "sechs";
          break;
        default:
          break;
      }
      return zahlAlsText;
    }

    /**
     * String zu Zahl Konverter,
     * @return Zahl, weil Java statisch ist.
     */
    public int stringZuZahl(String pString) {

      switch (pString) {
        case "eins":
          textAlsZahl = 1;
          break;
        case "zwei":
          textAlsZahl = 2;
          break;
        case "drei":
          textAlsZahl = 3;
          break;
        case "vier":
          textAlsZahl = 4;
          break;
        case "fünf":
          textAlsZahl = 5;
          break;
        case "sechs":
          textAlsZahl = 6;
          break;
        default:
          break;
      }
      return textAlsZahl;
    }

}
