/**
 * Klasse Spieler mit Fehlern
 *
 * @author David Tepa�e
 * @version 01
 *
 * in dieser Klasse ist ein Fehler. Sie stimmt nicht mit
 * der Beschreibung unseres Spiels �berein! Finden und korrigieren sie ihn.
 *
 */


public class Spieler
{
 /**
  * Eine Person kennt zwei W�rfel und den Topf:
  */

   private   Wuerfel wuerfel1;
   private   Wuerfel wuerfel2;
   private   Topf topf;

  /**
  * Hier folgen die Attribute der Klasse Person:
  */

   private String name;
   private int punkte;
   private int vermoegen;
   private int wurfAnzahl;
   private int pPunkte;

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
    wuerfel1.rollen();
    wuerfel2.rollen();

    pPunkte = wuerfel1.punktzahlAngeben() + wuerfel2.punktzahlAngeben();

    if (pPunkte == 7) {
      pPunkte = pPunkte - 7;
    }

    this.punkte = this.punktestandAngeben() + pPunkte;
    pPunkte = 0;
    this.wurfAnzahl++;
    System.out.println("Zug beendet, der andere Spieler ist am Zug!");
  }

   /**
    * Legt einen Spielernamen fest
    */
   public void setName (String neuerName)
   {
     this.name = neuerName;
   }
}
