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
        "Opel Astra",
        "Toyota Corolla",
        "PZKW 3",
        "Messerschmitt Bf 109",
    };

    private Queue<Fahrzeug> strasse = new Queue<Fahrzeug>();
    private Queue<Fahrzeug> kontrolle = new Queue<Fahrzeug>();

    private int mindestAutos;
    private int mindestMaengel;
    private int kontrollierteFahrzeuge = 0;
    private int maengelFahrzeuge = 0;

    public Polizist(int pMindestAnzahl, int pMindestMaengel) {
        this.mindestAutos = pMindestAnzahl;
        this.mindestMaengel = pMindestMaengel;
        Util.verkehrErstellen(this);
        this.starteKontrolle();
    }


    /**
     * Automatisierte Kontrolle
     */
    private void starteKontrolle() {
        while (!this.strasse.isEmpty()) {
            Util.wait(2);
            // 50% der Fahrzeuge werden herausgewunken
            if (Util.randomInt(1) == 1) {
                herausWinken();
            } else {
                weiterWinken();
            }
        }
        System.out.println("Die Straße ist leer");
    }

    /**
     * Entfernt ein Fahrzeug von der Straße, ohne es zu kontrollieren.
     */
    public void weiterWinken() {
        System.out.println(
            "\n\nWeitergewunken:"
            + "\n    Modell:      " + this.strasse.front().getModell()
            + "\n    Farbe:       " + this.strasse.front().getFarbe()
            + "\n    Kennzeichen: " + this.strasse.front().getKennzeichen()
        );
        this.strasse.dequeue();
    }

    /**
     * Entfernt ein Fahrzeug von der Straße, und kontrolliert es.
     */
    public void herausWinken() {
        this.kontrolle.enqueue(this.strasse.front());
        System.out.println(
            "\n\nHerausgewunken: (#" + (this.kontrollierteFahrzeuge + 1) + ")"
            + "\n    Modell:      " + this.kontrolle.front().getModell()
            + "\n    Farbe:       " + this.kontrolle.front().getFarbe()
            + "\n    Kennzeichen: " + this.kontrolle.front().getKennzeichen()
        );
        this.strasse.dequeue();
        this.kontrollieren();
    }


    /**
     * Überprüft die Angaben des Fahrzeugs und lässt es weiterfahren / verhaftet den Fahrer.
     */
    private void kontrollieren() {
        Util.wait(1);
        if (this.kontrollierteFahrzeuge >= this.mindestAutos || this.maengelFahrzeuge >= this.mindestMaengel) {
            System.out.println("Dieser Polizist hat genug Autos kontrolliert.");
            throw new Error("Dieser Polizist hat genug Autos kontrolliert."); // Beendet das Programm
        }
        
        Fahrzeug auto = this.kontrolle.front();
        if (this.istIllegal() || !auto.getVerkehrstauglichkeit()) {

            String grund = getGrund(this.kontrolle.front());
            System.out.println("Der Fahrer des " + auto.getFarbe() + "en " + auto.getModell() + " wurde verhaftet. Grund: illegale(s) " + grund);
            this.maengelFahrzeuge++;
        } else {
            System.out.println("Der Fahrer des " + auto.getFarbe() + "en " + auto.getModell() + " darf weiterfahren.");
        }
        this.kontrolle.dequeue();
        this.kontrollierteFahrzeuge++;
    }

    /**
     * Überprüft, ob die Werte illegal sind
     * @return
     */
    private boolean istIllegal() {
        for (int i = 0; i < this.illegaleKennzeichen.length; i++) {
            if (this.illegaleKennzeichen[i] == this.kontrolle.front().getKennzeichen()) {
                return true;
            }
        }
        
        for (int i = 0; i < this.illegaleFarben.length; i++) {
            if (this.illegaleFarben[i] == this.kontrolle.front().getFarbe()) {
                return true;
            }
        }
        
        for (int i = 0; i < this.illegaleModelle.length; i++) {
            if (this.illegaleModelle[i] == this.kontrolle.front().getModell()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Überprüft, warum das Fahrzeug illegal ist
     * @param pF Das zu kontrollierende Fahrzeug
     * @return "Modell", "Farbe", "Kennzeichen" oder "Fehler am Fahrzeug"
     */
    private String getGrund(Fahrzeug pF) {
        for (int i = 0; i < this.illegaleModelle.length; i++) {
            if (pF.getModell() == this.illegaleModelle[i]) {
                return "Modell";
            }
        }
        for (int i = 0; i < this.illegaleFarben.length; i++) {
            if (pF.getFarbe() == this.illegaleFarben[i]) {
                return "Farbe";
            }
        }
        for (int i = 0; i < this.illegaleKennzeichen.length; i++) {
            if (pF.getKennzeichen() == this.illegaleKennzeichen[i]) {
                return "Kennzeichen";
            }
        }

        if (!pF.getVerkehrstauglichkeit()) {
            return "Fehler am Fahrzeug";
        }
        
        return "Error";
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