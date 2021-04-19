/**
 * Write a description of class Schachtel here.
 *
 * @author
 * @version 0.0.1
 */
public class Schachtel {

  private int anzahlStaebchen;
  private boolean staebchenVorhanden;

  /**
   * Constructor for objects of class Schachtel
   */
  public Schachtel() {
    this.anzahlStaebchen = 0;
    this.staebchenVorhanden = false;
  }

  // Stäbchen von Spielern aufnehmen, wenn noch keine Stäbchen vorhanden sind
  public void staebchenAufnehmen(int pAnzahl) {
    if (this.staebchenVorhanden = true) {
      System.out.println("Es wurden schon Stäbchen eingelegt");
    } else {
      this.anzahlStaebchen = this.anzahlStaebchen + pAnzahl;
      this.staebchenVorhanden = true;
    }
  }

  // Stäbchen an einen Spieler ausgeben, wenn vorhanden
  public void staebchenAusgeben(int pAnzahl) {

    // Wenn der Spieler das letzte Stäbchen zieht, hat er verloren und die Chips gehen zum Gegner
    if (pAnzahl == 1) {
      this.anzahlStaebchen--;
      // Der Spieler hat verloren
      // Der Gegner bekommt die Chips

    // wennd der Spieler mehr Stäbchen haben will als vorhanden sind
    } else if (pAnzahl > this.anzahlStaebchen) {
      System.out.println("Es sind nicht genug Stäbchen vorhanden");

    } else {
      this.anzahlStaebchen = this.anzahlStaebchen - pAnzahl;
    }

  }

}
