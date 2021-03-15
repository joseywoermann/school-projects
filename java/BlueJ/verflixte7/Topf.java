
/**
 * Klasse Topf nach Beschreibung
 * 
 * @author David Tepaße
 * @version 01
 */

public class Topf
{
   /**
    *Attribut der Klasse Topf:
    */
   private int einsatz;

    /**
     * Konstruktor für Objekte der Klasse Topf:
     */
   public Topf()
   {
       // der Einsatz wird auf 0 gesetzt
       this.einsatz = 0;
   }

   /**
    *
    * Gibt die Summe, die im Topf liegt, zurück und leert den Topf.
    */
   public int einsatzAbgeben ()
   {
        int merkEinsatz=this.einsatz;
        this.einsatz=0;
        return merkEinsatz;     
   }

   /**
    * nimmt den einsatz auf
    */
   public void einsatzAufnehmen (int einsatz)
   {
        this.einsatz = this.einsatz + einsatz;
   }

}

