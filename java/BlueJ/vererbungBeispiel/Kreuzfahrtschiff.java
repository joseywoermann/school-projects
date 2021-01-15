public class Kreuzfahrtschiff extends Fahrzeug {

    private int anzahlZimmer;

    public Kreuzfahrtschiff(float pMaxSpeed, float pTankGroesse, String pID, int pAnzahlZimmer) {
      super(pMaxSpeed, pTankGroesse, pID);
      this.anzahlZimmer = pAnzahlZimmer;
    }

    public void ablegen() {
      System.out.println("Abgelegt");
    }

    public void anlegen() {
      System.out.println("Angelegt");
    }
}
