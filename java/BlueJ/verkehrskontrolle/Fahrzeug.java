public class Fahrzeug {
    private String modell;
    private String farbe;
    private String kennzeichen;
    private boolean verkehrstauglich;

    public Fahrzeug(String pModell, String pFarbe, String pKennzeichen) {
        this.modell = pModell;
        this.farbe = pFarbe;
        this.kennzeichen = pKennzeichen;
    }

    public void setVerkehrstauglichkeit(boolean pVerkehrstauglich) {
        this.verkehrstauglich = pVerkehrstauglich;
    }

    public String getModell() {
        return this.modell;
    }

    public String getFarbe() {
        return this.farbe;
    }

    public String getKennzeichen() {
        return this.kennzeichen;
    }
}