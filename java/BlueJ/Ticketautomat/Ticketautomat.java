/**
 * Die Klasse Ticketautomat modelliert einfache Ticketautomaten,
 * die Tickets zu einem Einheitspreis herausgeben.
 * Der Preis f�r die Tickets eines Automaten kann �ber den Konstruktor
 * festgelegt werden.
 * Ein Ticketautomat ist insofern 'naiv', dass er seinen Benutzern
 * vertraut, dass sie gen�gend Geld einwerfen, bevor sie sich ein Ticket
 * ausdrucken lassen.
 * Au�erdem nimmt er an, dass sinnvolle Betr�ge eingeworfen werden.
 *
 * @author David J. Barnes und Michael K�lling
 * @version 2003.05.15
 */

public class Ticketautomat {

    // Der Preis eines Tickets dieses Automaten.
    private int preis;

    // Der Betrag, der bisher vom Automatenbenutzer eingeworfen wurde.
    private int bisherGezahlt;

    // Die Geldsumme, die bisher von diesem Automaten eingenommen wurde.
    // private int gesamteinnahmen;

    // Summe, die noch gezahlt werden muss, bis ein Ticket gedruckt werden kann
    private int zuZahlen;

    // Kontostand des Automaten
    private int kontostand;




    /**
     * Erzeuge eine Maschine, die Tickets zum angegebenen Preis
     * (in Cent) ausgibt.
     * Zu beachten: Der Preis muss gr��er als Null sein,
     * der Automat �berpr�ft dies jedoch nicht.
     */
    public Ticketautomat(int ticketpreis) {

        preis = ticketpreis;

        // Diese Variablen werden nur waehrend der Bestellvorganges verwendet
        bisherGezahlt = 0;
        zuZahlen = preis;


        // gesamteinnahmen = 0;
        kontostand = 0;
    }



    /**
     * Liefere den Preis eines Tickets dieses Automaten (in Cent).
     */
    public int gibPreis() {
        return preis;
    }



    /**
     * Liefere die H�he des Betrags, der f�r das n�chste Ticket bereits
     * eingeworfen wurde.
     */
    public int gibBisherGezahltenBetrag() {
        return bisherGezahlt;
    }

    /**
     * Nimm den angegebenen Betrag (in Cent) als Anzahlung f�r das
     * n�chste Ticket.
     */
    public void geldEinwerfen(int betrag) {

        // Nur positive Einzahlungen akzeptieren
        if (betrag >= 0) {

          bisherGezahlt += betrag;

          // gesamteinnahmen += betrag;
          kontostand += betrag;

          calculateRestbetrag();

        } else {
          System.out.println("Nur positive Einzahlungen moeglich.");
        }
    }



    // Setze eingezahltes Geld auf 0
    public void resetMoney() {
      bisherGezahlt = 0;
      // gesamteinnahmen = 0;
      kontostand = 0;
    }


    // Neuen Ticketpreis festlegen
    public void setPrice(int ticketpreis) {
      preis = ticketpreis;
    }



    //Zeige gesamte Einnahmen an
    public void kontostand() {
      System.out.println("Kontostand: " + kontostand);
    }



    public void calculateRestbetrag() {
      zuZahlen = preis - bisherGezahlt; //Probleme wenn bisherGezahlt == 0
    }



    public void wechselgeldAusgabe() {
      if (bisherGezahlt >= preis) {
        int wechselgeld;

        // Wechselgeld ausrechen
        wechselgeld = bisherGezahlt - preis;
        bisherGezahlt = 0;

        // Kontostand anpassen
        kontostand = kontostand - wechselgeld;

        System.out.println("Ihr Wechselgeld: " + wechselgeld);
      }
    }

    /**
     * Drucke ein Ticket.
     * Aktualisiere die eingenommene gesamteinnahmen und setze den gezahlten
     * Betrag auf Null.
     */
    public void ticketDrucken() {
      if (bisherGezahlt >= preis) {

        // Den Ausdruck eines Tickets simulieren.
       System.out.println("##################");
       System.out.println("# Die BlueJ-Linie");
       System.out.println("# Ticket");
       System.out.println("# " + preis);
       System.out.println("##################");
       System.out.println();

       // Wechselgeld
       wechselgeldAusgabe();

       // Die bisherige Bezahlung zur�cksetzen.
       bisherGezahlt = 0;

     } else {
       System.out.println("Nicht genug Geld gezahlt. Es fehlen noch: " + zuZahlen);
     }

    }
}
