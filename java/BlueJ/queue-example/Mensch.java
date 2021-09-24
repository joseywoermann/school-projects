public class Mensch {

    private String name;
    private int alter;
    private int anzahlImpfungen;

    public Mensch(String pName, int pAlter, int pAnzahlImpfungen) {
        this.name = pName;
        this.alter = pAlter;
        this.anzahlImpfungen = pAnzahlImpfungen;
    }

    public void anstellen(Impfzentrum pIz) {
        pIz.patientenAufnehmen(this);
    }


    public int getAlter() {
        return this.alter;
    }

    public String getName() {
        return this.name;
    }

    public int getAnzahlImpfungen() {
        return this.anzahlImpfungen;
    }

    public void setAnzahlImpfungen(int pAnzahl) {
        this.anzahlImpfungen = pAnzahl;
    }

}