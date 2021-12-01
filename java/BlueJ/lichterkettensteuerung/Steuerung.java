public class Steuerung {

    private List<LED> lichterkette = new List<LED>();
    private int anzahlLEDs = 0;


    // Eine Steuerung ohne Lichterkette wird generiert
    public Steuerung() {

    }

    // Alle LEDs der verwalteten Lichterketten leuchten
    public void leuchten01() {
        throw new Error("Nicht implementiert");
    }

    // Jede zweite LED der Lichterkette leuchtet
    public void leuchten02() {
        this.lichterkette.toFirst();

        // Wenn keine LEDs vorhanden sidn, nichts machen
        if (this.lichterkette.getContent().equals(null)) return;

        boolean sollteLeuchten = true;

        while(this.lichterkette.hasAccess()) {
            if (sollteLeuchten) {
                this.lichterkette.getContent().lichtAn();
                sollteLeuchten = false;
            } else {
                sollteLeuchten = true;
            }
            this.lichterkette.next();
        }
    }

    // Jede dritte LED der Lichtekette leuchtet
    public void leuchten03() {
        throw new Error("Nicht implementiert");
    }

    // Die Lichtekette `pLichtekette` wird an die Lichterkette  der STeuerung angehängt. Die Anzahl der LEDs wird dementsprechend aktualisiert.
    public void lichterketteAnhaengen(List<LED> pLichterkette) {
        this.lichterkette.concat(pLichterkette);
        this.anzahlLEDsAktualisieren();
    }

    // Die Anzahl der LEDs in der von der Steuerung geregelten Lichtekette wird zurückgegeben.
    public int getAnzahlLEDs() {
        return this.anzahlLEDs;
    }

    // Aktualisiert die Anzahl der LEDs, die zur Zeit in der Liste enthalten sind.
    private void anzahlLEDsAktualisieren() {
        int anzahl = 0;
        this.lichterkette.toFirst();
        while(this.lichterkette.current != this.lichterkette.last) {
            anzahl++;
            this.lichterkette.next();
        }
        this.lichterkette.toFirst();
        this.anzahlLEDs = (anzahl + 1);
    }
}