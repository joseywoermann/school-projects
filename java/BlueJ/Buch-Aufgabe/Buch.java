class Buch
{
    // Autor des Buches
    private String autor;
    // Titel des Buches
    private String titel;
    // Seitenanzahl des Buches
    private int seiten;
    // Signatur des Buches
    private String signatur;
    // Wie oft das Buch ausgeliehen wurde
    private int ausleihAnzahl;
    // Wie lange das Buch ausgeliehen werden kann
    private int moeglicheAusleihzeit;

    /**
     * Setze den Autor und den Titel, wenn ein Exemplar erzeugt wird.
     */
    public Buch(String buchautor, String buchtitel, int seitenzahl)
    {
        autor = buchautor;
        titel = buchtitel;
        seiten = seitenzahl;
        signatur = " ";
        ausleihAnzahl = 0;
        moeglicheAusleihzeit = 3;
    }

    // Autor auslesen
    public String gibAutor() {
      return autor;
    }

    // Titel auslesen
    public String gibTitel() {
      return titel;
    }

    // Signatur auslesen
    public String gibSignatur() {
      return signatur;
    }

    // Auslesen, wie oft das Buch ausgeliehen wurde
    public int gibAusleihanzahl() {
      return ausleihAnzahl;
    }

    // Maximale Ausleihzeit ausgeben
    public int getMoeglicheAusleihzeit() {
      return moeglicheAusleihzeit;
    }



    // Buch ausleihen
    public void ausleihen() {
      ausleihAnzahl++;
    }

    // Autor ändern
    public void schreibAutor(String newAutor) {
      autor = newAutor;
    }

    // Titel ändern
    public void schreibTitel(String newTitel) {
      titel = newTitel;
    }

    // Signatur setzen
    public void setzeSigantur(String newSignatur) {
      if (newSignatur.length() == 10) {
        signatur = newSignatur;
        System.out.println("Signatur gesetzt.");
      } else {
        System.out.println("Signatur muss genau 10 Zeichen lang sein.");
      }
    }



    // Mögliche Ausleihzeit ändern
    public void setMaxAusleihzeit(int newMoeglicheAusleihzeit) {
      if (newMoeglicheAusleihzeit == 0) {
        moeglicheAusleihzeit = newMoeglicheAusleihzeit;

      } else if (newMoeglicheAusleihzeit == 1) {
        moeglicheAusleihzeit = newMoeglicheAusleihzeit;

      } else if (newMoeglicheAusleihzeit == 2) {
        moeglicheAusleihzeit = newMoeglicheAusleihzeit;

      } else if (newMoeglicheAusleihzeit == 3) {
        moeglicheAusleihzeit = newMoeglicheAusleihzeit;

      } else {
        System.out.println("Bitte entweder \"0\", \"1\", \"2\" oder \"3\" eingeben.");
      }
    }

    // Alle Details in Konsole auslesen
    public void detailAusgabe() {
      System.out.println("##################");
      System.out.println("Autor: " + autor);
      System.out.println("Titel: " + titel);
      System.out.println("Seitenzahl: " + seiten);
      System.out.println("Das Buch wurde " + ausleihAnzahl + " mal ausgeliehen.");

      if (signatur == " ") {
        System.out.println("Signatur : unbekannt");
      } else {
        System.out.println("Signatur: " + signatur);
      }

      if (moeglicheAusleihzeit == 0) {
        System.out.println("Dieses Buch ist nicht ausleihbar.");
      } else if (moeglicheAusleihzeit == 1) {
        System.out.println("Dieses Buch ist über das Wochenende ausleihbar.");
      } else if (moeglicheAusleihzeit == 2) {
        System.out.println("Dieses Buch ist für 7 Tage ausleihbar.");
      } else if (moeglicheAusleihzeit == 3) {
        System.out.println("Dieses Buch ist beliebig lange ausleihbar.");
      }

      System.out.println("##################");
    }
}
