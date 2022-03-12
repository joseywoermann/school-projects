public class Kreuzfahrtschiff extends Fahrzeug {

    // Variablen, die nur diese Klasse nutzen kann
    private int anzahlZimmer;

    public Kreuzfahrtschiff(float pMaxSpeed, float pTankGroesse, String pID, int pAnzahlZimmer) {
      super(pMaxSpeed, pTankGroesse, pID);
      this.anzahlZimmer = pAnzahlZimmer;
    }

    // Methoden, die nur diese Klasse nutzen kann
    public void ablegen() {
      System.out.println("Abgelegt");
    }

    public void anlegen() {
      System.out.println("Angelegt");
    }
}
