public class Auto extends Fahrzeug {

    private int anzahlSitze;

    public Auto(float pMaxSpeed, float pTankGroesse, String pID, int pAnzahlSitze) {
      super(pMaxSpeed, pTankGroesse, pID);
      this.anzahlSitze = pAnzahlSitze;
    }

    public void tuerOeffnen(int pTuerNummer) {
      System.out.println("Tuer " + pTuerNummer + " geoeffnet.");
    }
}
