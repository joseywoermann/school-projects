public class Wuerfel {

    private String[] farben = {
        "blau",   // 0
        "gelb",   // 1
        "grün",   // 2
        "rot",    // 3
        "weiß",   // 4
        "schwarz" // 5
    };

    private String[][] gewuerfelteFarben = {
      {
        null, null, null, null, null, null, null, null, null
      },
      {
        null, null, null, null, null, null, null, null, null
      },
      {
        null, null, null, null, null, null, null, null, null
      },
      {
        null, null, null, null, null, null, null, null, null
      },
      {
        null, null, null, null, null, null, null, null, null
      },
      {
        null, null, null, null, null, null, null, null, null
      }
    };

    private int zahl = 0;

    // Anzahl der geworfenen Zahlen
    private int blaus = 0;
    private int gelbs = 0;
    private int gruens = 0;
    private int rots = 0;
    private int weisss = 0;
    private int schwarzs = 0;


    /**
     * Constructor for objects of class Wuerfel
     */
    public Wuerfel() {

    }

    /**
     * Würfel 9 mal würfeln
     * @param pZahl
     * @return int
     */
    public int augenZahlWuerfeln() {
      for (int i = 0; i < 9; i++) {
        this.zahl = this.zahl + this.zufallsAugenzahlGenerieren();
      }
      return this.zahl;
    }


    /**
     * Hauptmethode für Farben; Daten aus Array in Integern speichern
     * @param pZahl
     * @return
     */
    public void farbenZaehlen() {
      farbeWuerfelnUndZuordnen();
      //blau
      for (int i = 0; i < this.gewuerfelteFarben[0].length; i++) {
        if (this.gewuerfelteFarben[0][i] == "blau") {
          this.blaus++;
        }
      }

      //gelb
      for (int i = 0; i < this.gewuerfelteFarben[1].length; i++) {
        if (this.gewuerfelteFarben[1][i] == "gelb") {
          this.gelbs++;
        }
      }

      //gruen
      for (int i = 0; i < this.gewuerfelteFarben[2].length; i++) {
        if (this.gewuerfelteFarben[2][i] == "grün") {
          this.gruens++;
        }
      }

      //rot
      for (int i = 0; i < this.gewuerfelteFarben[3].length; i++) {
        if (this.gewuerfelteFarben[3][i] == "rot") {
          this.rots++;
        }
      }

      //weiss
      for (int i = 0; i < this.gewuerfelteFarben[4].length; i++) {
        if (this.gewuerfelteFarben[4][i] == "weiß") {
          this.weisss++;
        }
      }

      //schwarz
      for (int i = 0; i < this.gewuerfelteFarben[5].length; i++) {
        if (this.gewuerfelteFarben[5][i] == "schwarz") {
          this.schwarzs++;
        }
      }
    }

    /**
     * 9 Farben würfeln & zurodnen
     * @param pZahl
     * @return String[]
     */
    public String[][] farbeWuerfelnUndZuordnen() {
      for (int i = 0; i < 9; i++) { // 9mal würfeln
        String farbe = this.zufallsFarbeGenerieren();
        // gewürfelte Farbe zu Array zuordnen
        /**
         * BUG: Aktuell werden die farben an der Position ins Array gestellt,
         * der wievielte Wurf es ist (ergobt ohne Beispiel keinen Sinn)
         * Beispiel:
         * der 3. Wurf ist "rot" => "rot" wird an die dritte Stelle ins Array gestellt, nicht an die erste.
         * Das sorgt dafür, dass wenn z.B. alle Würfe "rot" sind, dass das Array überfließen könnte.
         * // EDIT: Der Bug ist egal, weil die subarrays 9 lang sind
         */
        switch (farbe) {
          case "blau":
            this.gewuerfelteFarben[0][i] = farbe;
            break;
          case "gelb":
            this.gewuerfelteFarben[1][i] = farbe;
            break;
          case "grün":
            this.gewuerfelteFarben[2][i] = farbe;
            break;
          case "rot":
            this.gewuerfelteFarben[3][i] = farbe;
            break;
          case "weiß":
            this.gewuerfelteFarben[4][i] = farbe;
            break;
          case "schwarz":
            this.gewuerfelteFarben[5][i] = farbe;
            break;
          default:
            break;
        }
      }
      //System.out.println(this.gewuerfelteFarben);
      return this.gewuerfelteFarben;
    }


    /**
     * Zufällige Farbe generieren
     * @return String
     */
    public String zufallsFarbeGenerieren() {
        int zahl = zufallsZahl(0, 5);
        String farbe = farben[zahl];
        return farbe;
    }

    /**
     * Zufällige Zahl generieren
     * @return
     */
    public int zufallsAugenzahlGenerieren() {
      int zahl = zufallsZahl(1, 6);
      return zahl;
    }

    /**
     * Eine zufällige ganze Zahl zwischen 2 Zahlen generieren.
     * @param pUnteresLimit Die niedrigste möglich Zahl.
     * @param pOberesLimit Die höchste möglich Zahl.
     */
    public int zufallsZahl(int pUnteresLimit, int pOberesLimit) {
      int zahl = (int)Math.round(Math.random() * (pOberesLimit - pUnteresLimit));
      return zahl;
    }


    // get-Methoden

    /**
     * Die Anzahl der blauen Seiten ausgeben
     * @return
     */
    public int getBlau() {
      return this.blaus;
    }

    /**
     * Die Anzahl der gelben Seiten ausgeben
     * @return
     */
    public int getGelb() {
      return this.gelbs;
    }

    /**
     * Die Anzahl der grünen Seiten ausgeben
     * @return
     */
    public int getGruen() {
      return this.gruens;
    }

    /**
     * Die Anzahl der roten Seiten ausgeben
     * @return
     */
    public int getRot() {
      return this.rots;
    }

    /**
     * Die Anzahl der weißen Seiten ausgeben
     * @return
     */
    public int getWeiss() {
      return this.weisss;
    }

    /**
     * Die Anzahl der schwarzen Seiten ausgeben
     * @return
     */
    public int getSchwarz() {
      return this.schwarzs;
    }

}
