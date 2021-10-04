public class Impfzentrum {

    private int altersgrenze;

    private Queue<Mensch> warteschlange = new Queue<Mensch>();

    /**
     * Erstellt ein neues Impfzentrum
     * @param pAG Die untere Altersgrenze ab der Impfungen ausgegeben werden sollen
     */
    public Impfzentrum(int pAG) {
        this.altersgrenze = pAG;
    }

    /**
     * Fügt einen Patienten zur Warteschlange hinzu.
     * @param pPatient
     */
    public void patientenAufnehmen(Mensch pPatient) {
        if (datenUeberpruefen(pPatient) == true) {
            this.warteschlange.enqueue(pPatient);
        }
    }

    /**
     * Impft die Person
     */
    public void impfen() {

        if (this.warteschlange.isEmpty()) return;

        Mensch patient = this.warteschlange.front();

        int impfungen = (patient.getAnzahlImpfungen() + 1);

        patient.setAnzahlImpfungen(impfungen );
        System.out.println(patient.getName() + " hat die " + impfungen + ". Impfung erhalten.");

        this.warteschlange.dequeue();

    }


    /**
     * Überprüft die Daten des Patienten und ermittelt, ob er / sie impfberechtigt ist.
     * @param pPatient
     * @return
     */
    private boolean datenUeberpruefen(Mensch pPatient) {
        if (pPatient.getAlter() < this.altersgrenze) {
            System.out.println("Dieser Mensch ist nicht alt genug.");
            return false;
        }

        if (pPatient.getAnzahlImpfungen() >= 2) {
            System.out.println("Dieser Mensch hat schon 2 Impfungen erhalten.");
            return false;
        }
        return true;
    }
}
