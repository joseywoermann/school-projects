/**
 * Klasse Spieler mit Fehlern
 * TODO: Wenn Spieler B gleich viele Würfe hat wie A, muss das Spiel beendet werden.
 */


public class Spieler
{
 /**
  * Eine Person kennt zwei W�rfel und den Topf:
  */

   private  Wuerfel wuerfel1;
   private  Wuerfel wuerfel2;
   private  Topf topf;
   private Spieler gegner;

  /**
  * Hier folgen die Attribute der Klasse Person:
  */

   private String name;
   private int punkte;
   private int vermoegen;
   private int wurfAnzahl;
   private int pPunkte;
   private boolean hatElfGewuerfelt;

   /**
    * Konstruktor f�r Objekte der Klasse Spieler
    * Mit der folgenden Methode wird ein Objekt der Klasse Spieler hergestellt.
   */
    public Spieler(Wuerfel pWuerfel1, Wuerfel pWuerfel2, Topf pTopf)
    {
      this.wuerfel1 = pWuerfel1;
      this.wuerfel2 = pWuerfel2;
      this.topf = pTopf;
      this.vermoegen = 1000;
      this.hatElfGewuerfelt = false;
    }

    public void setGegner(Spieler pGegner) {
      this.gegner = pGegner;
    }
   /**
    * Die bis dahin erreichte Punktesumme wird zur�ckgegeben.
    *
    */
   public int punktestandAngeben ()
   {
       return this.punkte;
   }


   /**
    * Setzt den topf zurück
    */
   public void topfLeeren ()
   {
    this.vermoegen = this.vermoegen + this.topf.einsatzAbgeben();
    this.punkte = 0;
    this.wurfAnzahl = 0;
   }

   /**
    * gibt aus, wie oft schon gewürfelt wurde
    */
   public int wurfAnzahlAngeben ()
   {
     return this.wurfAnzahl;
   }

   /**
    * Legt einen Einsatz fest + fügt es dem topf hinzu
    */
    public void einsatzSetzen (int einsatz) {
      if (this.vermoegen < einsatz) {
        einsatz = this.vermoegen;
      }

      this.topf.einsatzAufnehmen(einsatz);
      this.vermoegen=this.vermoegen-einsatz;
    }

   /**
    * Führt die Methode "rollen()" bei 2 Würfeln aus und addiert die Augenzahl
    */
  public void wuerfeln () {

    // Test ob der Spieler Einsatz gesetzt hat.
    if (this.topf.einsatzAngeben() == 0) {
      System.out.println("Spiel kann ohne Einsatz nicht gestartet werden.");
    } else {

      // Test ob der Spieler im letzten Zug eine 11 gewürfelt hat
      if (this.hatElfGewuerfelt == true) {
        System.out.println("Der andere Spieler ist am Zug!");
      } else {
        //gegner.hatElfGewuerfelt = false;
        setHatElfGewuerfelt(false);
        wuerfel1.rollen();
        wuerfel2.rollen();

        // Würfelergebnis aus 2 Würfeln
        pPunkte = wuerfel1.punktzahlAngeben() + wuerfel2.punktzahlAngeben();
        // Wenn der Spieler eine 11 gewürfelt hat, Punkte abziehen
        if (pPunkte == 11) {
          this.hatElfGewuerfelt = true;
          pPunkte = this.punktestandAngeben() - 11;
          System.out.println("Zug beendet, der andere Spieler ist am Zug!");
        } else {
          pPunkte = this.punktestandAngeben() + pPunkte;
        }

        this.punkte = pPunkte;
        pPunkte = 0;
        this.wurfAnzahl++;
      }
    }
  }

   /**
    * Legt einen Spielernamen fest
    */
   public void setName (String neuerName)
   {
     this.name = neuerName;
   }

   /**
    * Testet, ob der Spieler eine "11-Sperre" hat
    */
   public void getHatElfGewuerfelt() {
     return this.hatElfGewuerfelt
   }

   /**
    * Setzt die "11-Sperre" beim Gegner zurück
    */
   public void setHatElfGewuerfelt(boolean pWert) {
     gegner.hatElfGewuerfelt = pWert;
   }
}
