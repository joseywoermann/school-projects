public class Rechner {
    //private int zahl1;
    private int result;

    /**
     * Konstruktor für Objekte der Klasse Rechner
     */
    public Rechner() {
        // Instanzvariable initialisieren
        //zahl1 = 12;
        result = 0;
    }


    // Grundrechenarten mit 2 angegebenen Zahlen (Nur ganze Zahlen von -2,147,483,648 bis 2,147,483,647)

    public int add(int pZahl1, int pZahl2) {
        result = pZahl1 + pZahl2;
        return result;
    }

    public int subtract(int pZahl1, int pZahl2) {
        result = pZahl1 - pZahl2;
        return result;
    }

    public int multiply(int pZahl1, int pZahl2) {
        result = pZahl1 * pZahl2;
        return result;
    }

    public int divide(int pZahl1, int pZahl2) {
        result = pZahl1 / pZahl2;
        return result;
    }
}
