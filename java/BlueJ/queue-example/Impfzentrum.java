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
        this.warteschlange.enqueue(pPatient);
    }

    /**
     * Impft die Person
     */
    public void impfen() {

        Mensch patient = this.warteschlange.front();

        if (datenUeberpruefen(patient) != true) return;

        int impfungen = patient.getAnzahlImpfungen();

        patient.setAnzahlImpfungen(impfungen + 1);
        System.out.println(patient.getName() + " hat die " + (impfungen + 1) + ". Impfung erhalten.");

        this.warteschlange.dequeue();
    }


    /**
     * Überprüft die Daten des Patienten und ermittelt, ob er / sie impfberechtigt ist.
     * @param pPatient
     * @return
     */
    private boolean datenUeberpruefen(Mensch pPatient) {

        boolean impfberechtigt = true;

        if (pPatient.getAlter() < this.altersgrenze) {
            System.out.println("Dieser Mensch ist nicht alt genug.");
            impfberechtigt = false;
        }

        if (pPatient.getAnzahlImpfungen() >= 2) {
            System.out.println("Dieser Mensch hat schon 2 Impfungen erhalten.");
            impfberechtigt = false;
        }

        return impfberechtigt;
    }
}