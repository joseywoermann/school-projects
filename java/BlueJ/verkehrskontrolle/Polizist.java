public class Polizist {

    private String[] illegaleKennzeichen = {
        "DVZ5456456",
        "DV35HNG1NF",
        "SDGFB4856R"
    };
    
    private String[] illegaleFarben = {
        "pink",
        "violett",
        "ocker"
    };
    
    private String[] illegaleModelle = {
        "Lamborghini Murcielago",
        "Toyota Corolla",
        "PZKW 3",
        "Boeing 747"
    };

    private Queue<Fahrzeug> strasse = new Queue<Fahrzeug>();
    private Queue<Fahrzeug> kontrolle = new Queue<Fahrzeug>();

    private int mindestAutos;
    private int mindestMaengel;
    private int kontrollierteFahrzeuge = 0;
    private int maengelFahrzeuge = 0;

    public Polizist(int pMA, int pMM) {
        this.mindestAutos = pMA;
        this.mindestMaengel = pMM;
        Util.verkehrErstellen(this);
    }

    public void weiterWinken() {
        this.strasse.dequeue();
    }

    public void herausWinken() {
        Util.debug("Herausgewunken");
        this.kontrolle.enqueue(this.strasse.front());
        this.strasse.dequeue();
    }
    
    public void kontrollieren() {
        if (this.kontrollierteFahrzeuge >= this.mindestAutos || this.maengelFahrzeuge >= this.mindestMaengel) {
            System.out.println("Dieser Polizist hat genug Autos kontrolliert.");
            throw new Error("Fertig"); // Beendet das Programm
        }
        
        Fahrzeug auto = this.kontrolle.front();
        if (this.istIllegal() || auto.getVerkehrstauglichkeit()) {
            System.out.println("Der Fahrer des " + auto.getFarbe() + "en " + auto.getModell() + " wurde verhaftet.");
            this.maengelFahrzeuge++;
        } else {
            System.out.println("Der Fahrer des " + auto.getFarbe() + "en " + auto.getModell() + " darf weiterfahren.");
        }
        this.kontrolle.dequeue();
        this.kontrollierteFahrzeuge++;
    }

    public boolean istIllegal() {
        for (int i = 0; i < this.illegaleKennzeichen.length; i++) {
            if (this.illegaleKennzeichen[i] == this.kontrolle.front().getKennzeichen()) {
                return true;
            }
        }
        
        for (int i = 0; i < this.illegaleFarben.length; i++) {
            if (this.illegaleFarben[i] == this.kontrolle.front().getKennzeichen()) {
                return true;
            }
        }
        
        for (int i = 0; i < this.illegaleModelle.length; i++) {
            if (this.illegaleModelle[i] == this.kontrolle.front().getKennzeichen()) {
                return true;
            }
        }
        return false;
    }

    public void kolonneAufloesen() {
        while (!this.kontrolle.isEmpty()) {
            this.kontrolle.dequeue();
        }
    }

    public int getKontrollierteFahrzeuge() {
        return this.kontrollierteFahrzeuge;
    }

    public int getMaengelFahrzeuge() {
        return this.maengelFahrzeuge;
    }
    
    public void addCar(Fahrzeug pFahrzeug) {
        this.strasse.enqueue(pFahrzeug);
    }

}