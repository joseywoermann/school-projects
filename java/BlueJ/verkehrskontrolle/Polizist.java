public class Polizist {

    private String[] kennzeichen;
    private Queue<Fahrzeug> warteschlange = new Queue<Fahrzeug>();

    private int mindestAnzahl;
    private int maximalAnzahl;
    private int kontrollierteFahrzeuge;
    private int maengelFahrzeuge;

    public Polizist() {}

    public void weiterWinken() {

    }

    public void herausWinken() {

    }

    public boolean verkehrstauglichkeitBerechnen() {
        return true;
    }

    public boolean kennzeichenUeberpruefen() {
        return true;
    }

    public void kolonneAufloesen() {
        
    }

    public int getKontrollierteFahrzeuge() {
        return 0;
    }

    public int getMaengelFahrzeuge() {
        return 0;
    }

}