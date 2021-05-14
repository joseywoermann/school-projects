// Für den Scanner
import java.util.*;

public class Spieler {

    private int punktestand = 0;
    private int platzierung = 0;
    private int augenzahl = 0;
    private String aufgabenstellung = null;
    private String ergebnis = null;

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

    public void gegnerFestlegen(Spieler pGegner) {
        this.gegner = pGegner;
    }

    /**
     * Aufgabe "aussuchen" und starten
     */
    public void aufgabeStarten() {
        this.aufgabenstellung = aufgabe.zufallsAufgabeGenerieren();
        System.out.println(this.aufgabenstellung);
        this.aufgabeDurchfuehren();
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
     * @return integer
     */
    public int getPunktestand() {
        return this.punktestand;
    }

    /**
     * Die Platzierung für eine Spieler festlegen.
     * @param pPunkte
     */
    public void setPlatzierung(int pPunkte) {
        if (pPunkte == 1 || pPunkte == 2) {
            this.platzierung = pPunkte;
        }
    }

    /***
     * 
     */
    public void aufgabeDurchfuehren() {

      // neuen Scanner erzeugen
      Scanner scanner = new Scanner(System.in);
      int anzahlWuerfe = 0;

      // erster Wurf ist verpflichtend
      //wuerfel.zufallsFarbeGenerieren();
      //wuerfel.zahlZuString();
      


      /*for (int i = 0; i < 3; i++) {
        System.out.println("Willst du noch einmal würfeln um potentiell mehr Punkte zu erhalten?\nJa/Nein");
        String nochMalWerfen = scanner.nextLine();
        //System.out.println(nochMalWerfen);
        
        wuerfel.zufallsFarbeGenerieren();
        int zahl = wuerfel.zufallsAugenzahlGenerieren();
        wuerfel.zahlZuString(zahl);
      }*/
    }

    /**
     * Die 3 Würfel werfen
     */
    /*public void wuerfelWerfen() {
      wuerfel1.
    }*/

    public void ergebnisseWeiterleiten(String pFarbe, String pAnzahlFarbe) {
      aufgabe.aufgabeAuswerten(pFarbe, pAnzahlFarbe);
    }

}
