public class Wuerfel {

    private String[] farben = {
        "blau",   // 0
        "gelb",   //1
        "grün",   //2
        "rot",    //3
        "weiß",   //4
        "schwarz" //5
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

    private String augenzahlString;

    private String farbe;
    private int zahl = 0;

    private int blaus = 0;
    private int gelbs = 0;
    private int gruens = 0;
    private int rots = 0;
    private int weisss = 0;
    private int schwarzs = 0;


    /**
     * Constructor for objects of class Wuerfel
     */
    public Wuerfel() {}


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
     * 9 Farben würfeln & zurodnen
     * @param pZahl
     * @return String[]
     */
    public String[][] farbeWuerfelnUndZuordnen() {
      for (int i = 0; i < 9; i++) {
        String farbe = this.zufallsFarbeGenerieren();
        // gewürfelte Farbe zu Array zuordnen
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
      System.out.println(this.gewuerfelteFarben);
      return this.gewuerfelteFarben;
    }

    /**
     *
     * @param pZahl
     * @return
     */
    public void farbenZaehlen() {
      //blau
      for (int i = 0; i < this.gewuerfelteFarben[0].length; i++) {
        this.blaus++;
      }
      //gelb
      for (int i = 0; i < this.gewuerfelteFarben[1].length; i++) {
        this.gelbs++;
      }
      //gruen
      for (int i = 0; i < this.gewuerfelteFarben[2].length; i++) {
        this.gruens++;
      }
      //rot
      for (int i = 0; i < this.gewuerfelteFarben[3].length; i++) {
        this.rots++;
      }
      //weiss
      for (int i = 0; i < this.gewuerfelteFarben[4].length; i++) {
        this.weisss++;
      }
      //schwarz
      for (int i = 0; i < this.gewuerfelteFarben[5].length; i++) {
        this.schwarzs++;
      }
    }

    /**
     * Zahl zu String umwandeln
     * @return String, weil Java statisch ist.
     */
    public String zahlZuString(int pZahl) {
        int augenzahl = pZahl;

        switch (augenzahl) {
          case 1:
            this.augenzahlString = "eins";
            break;
          case 2:
            this.augenzahlString = "zwei";
            break;
          case 3:
            this.augenzahlString = "drei";
            break;
          case 4:
            this.augenzahlString = "vier";
            break;
          case 5:
            this.augenzahlString = "fünf";
            break;
          case 6:
            this.augenzahlString = "senchs";
            break;
          default:
            break;
        }
        return this.augenzahlString;
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

}
