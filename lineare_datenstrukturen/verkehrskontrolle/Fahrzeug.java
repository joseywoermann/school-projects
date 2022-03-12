    public class Fahrzeug {
    private String modell;
    private String farbe;
    private String kennzeichen;
    private boolean verkehrstauglich;

    /**
     * Ein Fahrzeug
     */
    public Fahrzeug(String pModell, String pFarbe, String pKennzeichen) {
        this.modell = pModell;
        this.farbe = pFarbe;
        this.kennzeichen = pKennzeichen;
        
        // 20% Wahrscheinlichkeit dass es nicht verkehrstauglich ist
        if (Util.randomInt(100) < 20) {
            this.setVerkehrstauglichkeit(false);
        } else {
            this.setVerkehrstauglichkeit(true);
        }
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
    
    public boolean getVerkehrstauglichkeit() {
        return this.verkehrstauglich;
    }
}