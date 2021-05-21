//import java.util.Scanner;

public class Spieler {

    private int punktestand = 0;
    private int platzierung = 0;
    private int augenzahl = 0;
    private String aufgabenstellung = null;
    private String ergebnis = null;
    //private boolean nochmalWuerfelnJaNein = true;

    private Spieler gegner;
    private Aufgabe aufgabe;
    private Wuerfel wuerfel;


    /**
     * Constructor for objects of class Spieler
     */
    public Spieler(Aufgabe pAufgabe, Wuerfel pWuerfel) {
      this.aufgabe = pAufgabe;
      this.wuerfel = pWuerfel;
    }

    /**
     * Gegner kann nicht im Konstruktor festgelegt werden, deshalb hier.
     * @param pGegner
     */
    public void gegnerFestlegen(Spieler pGegner) {
      this.gegner = pGegner;
    }

    /**
     * Aufgabe "aussuchen" und starten (Start-Methode)
     */
    public void aufgabeStarten() {
      this.aufgabenstellung = aufgabe.zufallsAufgabeAussuchen();
      System.out.println("Deine Aufgabe: " + this.aufgabenstellung + " und versuche, eine möglichst hohe Auganzahl zu erreichen.");
      this.aufgabeDurchfuehren();
    }

    /**
     * Hauptmethode für Spieler
     */
    public void aufgabeDurchfuehren() {
      // Augenzahlen
      this.augenzahl = wuerfel.augenZahlWuerfeln();
      System.out.println("Augenzahl: " + this.augenzahl);
      // Farben & deren Anzahl
      wuerfel.farbenZaehlen();

      // Spieler fragen, ob er nochmal würfeln will, oder den Zug beenden will
      System.out.println("Möchtest du nochmal würfel, um dein Ergebnis zu verbessern? Dies kann dein Ergebnis aber auch verschlechtern, wenn du dann deine Aufgabe nichtmehr erfüllen kannst.\nWenn du nochmal würfeln willst, führe die Methode \"nochmalWuerfeln()\" aus, wenn nicht, führe \"zugBeenden()\" aus");
    }

    // Wenn aufgerufen, soll nochmal gewürfelt werden
    public void nochmalWuerfeln() {
      // Augenzahlen
      int augenzahlTMP = wuerfel.augenZahlWuerfeln();
      this.augenzahl = this.augenzahl + augenzahlTMP;
      //System.out.println("Augenzahl: " + this.augenzahl);
      // Farben & deren Anzahl
      wuerfel.farbenZaehlen();

      // ausgeben, was gerade gewürfelt wurde
      System.out.println("Du hast gerade eine " + augenzahlTMP + " gewürfelt.");
      // Farben ausgeben (erstmal testen)
    }

    // Auswerten
    public void zugBeenden() {
      // Ergebnisse zur Kopntrolle an Aufgabe weitergeben
      this.ergebnisseWeiterleiten(this.augenzahl);
    }

    /**
     * Ergebnisse an die Aufgabe für die Auswertung weiterleiten
     * @param pAugenzahl
     */
    public void ergebnisseWeiterleiten(int pAugenzahl) {
      int blau = wuerfel.getBlau();
      int gelb = wuerfel.getGelb();
      int gruen = wuerfel.getGruen();
      int rot = wuerfel.getRot();
      int weiss = wuerfel.getWeiss();
      int schwarz = wuerfel.getSchwarz();
      aufgabe.aufgabeAuswerten(pAugenzahl, blau, gelb, gruen, rot, weiss, schwarz);
    }

    /**
     * Prüfen, welcher Spieler mehr Punkte hat, und die Platzierungen anpassen
     */
    public void platzierungBerechnen() {
      if (gegner.getPunktestand() < this.punktestand) {
        this.setPlatzierung(1); // Dieser Spieler hat mehr Punkte
        gegner.setPlatzierung(2);

      } else if (gegner.getPunktestand() == this.punktestand) {
        this.setPlatzierung(1); // Beide haben gleich viele Punkte
        gegner.setPlatzierung(1);

      } else {
        this.setPlatzierung(2); // Dieser Spieler hat weniger Punkte
        gegner.setPlatzierung(1);
      }
    }

    /**
     * Den Punktestand dieses Spielers ausgeben
     * @return Punktestand
     */
    public int getPunktestand() {
      return this.punktestand;
    }

    /**
     * Die Platzierung für eine Spieler festlegen.
     * @param Platzierung
     */
    public void setPlatzierung(int pPlatzierung) {
      if (pPlatzierung == 1 || pPlatzierung == 2) {
        this.platzierung = pPlatzierung;
      }
    }
}
