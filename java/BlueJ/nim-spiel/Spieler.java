/**
 * Write a description of class Spieler here.
 *
 * @author
 * @version 0.0.1
 */

/*

TODO:
 - Überprüfen, ob noch ausreichend Stäbchen vorhanden sind
 - überprüfen, ob der Spieler gerade schon gezogen hat

*/
public class Spieler {

  // Attribute
  private int anzahlChips;
  private boolean istGewinner;

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

    // Prüfen ob die Anzahl der Stäbchen erlaubt ist
    if (pAnzahl >= 1 && pAnzahl <= 3) {

      // Wenn der Spieler das / die letze(n) Stäbchen zieht
      if (schachtel.getStabechenAnzahl() <= pAnzahl) {

        // TODO: Überprüfen, ob noch ausreichend Stäbchen vorhanden sind

        // Topf leeren und Chips an den Gegner auszahlen
        schachtel.staebchenAusgeben(pAnzahl);
        topf.topfLeeren();
        gegner.fuegeChipsHinzu(2);
        gegner.istGewinner = true;

      } else {
        schachtel.staebchenAusgeben(pAnzahl);
      }

    } else {
      System.out.println("Du darfst nur 1 bis 3 Stäbchen ziehen");
    }
  }


  public void fuegeChipsHinzu(int pAnzahl) {
    if (pAnzahl >= 1) {
      this.anzahlChips = this.anzahlChips + pAnzahl;
    }
  }

}
