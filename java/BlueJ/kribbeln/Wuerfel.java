public class Wuerfel {

    private int augenzahl;
    private String farbe;
    private int zahl;
    private String[] farben = {
        "blau",
        "gelb",
        "grün",
        "rot",
        "weiß",
        "schwarz"
    };


    /**
     * Constructor for objects of class Wuerfel
     */
    public Wuerfel() {
        augenzahl = 0;

    }

    // Zufälligen Integer zwischen 1 und 6 ausgeben
    public int zufallsZahlGenerieren() {
        augenzahl = (int)Math.round(Math.random() * (6 - 1));
        return augenzahl;
    }

    // Zufällige Farbe ausgeben
    public String zufallsFarbeGenerieren() {
        zahl = (int)Math.round(Math.random() * (5 - 0));
        farbe = farben[zahl];
        return farbe;
    }

}
