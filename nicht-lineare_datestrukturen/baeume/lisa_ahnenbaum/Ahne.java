public class Ahne {

    private String vorname;
    private String nachname;
    private char geschlecht;

    public Ahne(String pVorname, String pNachname, char pGeschlecht) {
        this.vorname = pVorname;
        this.nachname = pNachname;
        this.geschlecht = pGeschlecht;
    }

    public String getVorname() {
        return this.vorname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public char getGeschlecht() {
        return this.geschlecht;
    }
}