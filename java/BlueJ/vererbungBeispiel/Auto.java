public class Auto extends Fahrzeug {

    // Variablen, die nur diese Klasse nutzen kann
    private int anzahlSitze;

    public Auto(float pMaxSpeed, float pTankGroesse, String pID, int pAnzahlSitze) {
      super(pMaxSpeed, pTankGroesse, pID);
      this.anzahlSitze = pAnzahlSitze;
    }

    // Methoden, die nur diese Klasse nutzen kann
    public void tuerOeffnen(int pTuerNummer) {
      System.out.println("Tuer " + pTuerNummer + " geoeffnet.");
    }
}
