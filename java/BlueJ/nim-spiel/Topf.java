/**
 * Write a description of class Topf here.
 *
 * @author
 * @version 0.0.1
 */
public class Topf {

  private int anzahlChips;

  /**
   * Constructor for objects of class Topf
   */
  public Topf() {
    this.anzahlChips = 0;
  }

  public void chipAufnehmen() {
    this.anzahlChips++;
  }

  public void topfLeeren() {
    if (this.anzahlChips < 2) {
      System.out.println("Error. - Nicht genügend Chips im Topf.");
    } else {
      this.anzahlChips = this.anzahlChips - 2;
    }
  }
}
