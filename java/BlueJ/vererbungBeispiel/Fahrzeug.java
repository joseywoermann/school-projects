public class Fahrzeug {

    protected float maxSpeed;
    protected float tankGroesse;
    protected String id;

    public Fahrzeug(float pMaxSpeed, float pTankGroesse, String pID) {
      maxSpeed = pMaxSpeed;
      tankGroesse = pTankGroesse;
      id = pID;
    }

    public void fahre() {
      System.out.println("Fahren");
    }

    public void lenke(char richtung) {
      if (richtung == 'r') {
        System.out.println("Nach rechts lenken.");

      } else if (richtung == 'l') {
        System.out.println("Nach links lenken.");

      } else {
        System.out.println("Error");
      }
    }
}
