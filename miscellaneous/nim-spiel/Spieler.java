/*TODO:
 - Nach Reset darf der Gegner wieder ziehen
 - Melden, wann das Spiel zuende ist
*/

public class Spieler {

  // Attribute
  private int anzahlChips;
  private boolean istGewinner;
  private boolean hatGezogen;

  // bekannte Objekte
  private Topf topf;
  private Schachtel schachtel;

  private Spieler gegner;

  /**
   * Constructor for objects of class Spieler
   */
  public Spieler(Topf pTopf, Schachtel pSchachtel) {
    this.anzahlChips = 3;
    this.istGewinner = false;
    this.hatGezogen = false;

    this.topf = pTopf;
    this.schachtel = pSchachtel;
  }

  // Gegner festlegen
  public void gegnerFestlegen(Spieler pGegner) {
    this.gegner = pGegner;
  }

  // am Anfang einen Chip in den Topf legen
  public void chipEinlegen() {
    if (this.anzahlChips < 1) {
      System.out.println("Du hast nicht genügend Chips!");
    } else {
      topf.chipAufnehmen();
      anzahlChips--;
    }
  }

  // 10 bis 40 Stäbchen in die schachtel legen
  public void staebchenEinlegen(int pAnzahl) {
    if (pAnzahl >= 10 && pAnzahl <= 40) {
      schachtel.staebchenAufnehmen(pAnzahl);
    }
  }

  // 1 bis 3 Stäbchen ziehen
  public void staebchenZiehen(int pAnzahl) {

    // Prüfen, ob der aktuelle Spieler als letztes gezogen hat
    if (this.hatGezogen == true) {
      System.out.println("Der Gegner ist am Zug!");
    } else {

      // Prüfen ob die Anzahl der Stäbchen erlaubt ist
      if (pAnzahl >= 1 && pAnzahl <= 3) {

        // Verhindern, dass die Anzahl der Stäbchen in der Schachtel negativ wird
        if (schachtel.getStabechenAnzahl() - pAnzahl < 0) {
          System.out.println("Es sind nicht genügend Stäbchen vorhanden.");
        } else {

          // Wenn der Spieler das / die letze(n) Stäbchen zieht
          if (schachtel.getStabechenAnzahl() <= pAnzahl) {

            // Topf leeren und Chips an den Gegner auszahlen
            schachtel.staebchenAusgeben(pAnzahl);
            topf.topfLeeren();
            gegner.fuegeChipsHinzu(2);
            gegner.setGewinner(true);

            System.out.println("Du hast verloren");

          } else {
            schachtel.staebchenAusgeben(pAnzahl);
          }
          // Spieler hat als letztes gezogen & Gegner darf wieder ziehen
          this.hatGezogen = true;
          this.gegnerDarfZiehen();
        }
      } else {
        System.out.println("Du darfst nur 1 bis 3 Stäbchen ziehen");
      }
    }
  }

  // Chips zum Gewinner hinzufügen
  public void fuegeChipsHinzu(int pAnzahl) {
    if (pAnzahl >= 1) {
      this.anzahlChips = this.anzahlChips + pAnzahl;
    }
  }

  // Gegner "befreien"
  public void gegnerDarfZiehen() {
    gegner.hatGezogen = false;
  }

  // Spieler als Gewinner festlegen
  public void setGewinner(boolean pWahrOderFalsch) {
    this.istGewinner = pWahrOderFalsch;
  }

  // Werte für 2te Runde zurücksetzen
  public void resetAll() {
    this.istGewinner = false;
    this.hatGezogen = false;

    // auch in Schachtel & Topf
    schachtel.resetSchachtel();
    topf.resetTopf();
    System.out.println("Werte zurückgesetzt");
  }
}
