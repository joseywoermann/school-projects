/**
 * Dieser Kühlschrank ist ein extrem moderner Kühlschrank, welcher die Lebensmittel im inneren automatisch nach alphabetischer Reihenfolge sortiert, um schnellerer Zugriffszeiten zu ermöglichen.
 * Das ist zum Beispiel in modernen Großküchen sehr praktische, um Abläufe effizienter zu gestalten.
 */
public class Kuehlschrank {

    private BinarySearchTree<Essen> baum;

    /**
     * Erstellt einen neuen, leeren Kühlschrank.
     */
    public Kuehlschrank() {
        this.baum = new BinarySearchTree<Essen>();
    }

    /**
     * Fügt ein Essen zum Kühlschrank hinzu und sortiert es passend ein.
     * @param pName
     */
    public void addEssen(String pName, int pGewicht) {
        if (pName == null || pName == "") return;

        this.baum.insert(new Essen(pName, pGewicht));
        System.out.println(pGewicht + " Gramm " + pName + " " + this.grammatik(pGewicht) + " hinzugefügt und einsortiert.");
    }

    /**
     * Entfernt ein Essen aus dem Kühlschrank, insofern es vorhanden ist.
     * @param pName
     */
    public void removeEssen(String pName) {
        if (pName == null || pName == "") return;

        Essen essen = this.getEssen(pName);

        if (essen != null) {
            this.baum.remove(essen);
            System.out.println(essen.getGewicht() + " Gramm " + essen.getName() + " " + this.grammatik(essen.getGewicht()) + " entfernt.");
        } else {
            System.out.println(pName + " ist im Kühlschrank nicht vorhanden.");
        }
    }

    /**
     * Prüft, ob ein Essen im Kühlschrank vorhandne ist.
     * @param pName
     * @return
     */
    public boolean essenVorhanden(String pName) {
        if (pName == null || pName == "") return false;

        Essen essen = this.getEssen(pName);

        if (essen != null) {
            System.out.println(essen.getGewicht() + " Gramm " + essen.getName() + " sind vorhanden.");
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gibt ein Essen zurück, insofern es vorhandne ist, sonst `null`.
     * @param pName
     * @return
     */
    private Essen getEssen(String pName) {
        return this.baum.search(new Essen(pName, 0));
    }

    /**
     * Bei 1 muss es "wurde" heißen, bei alen anderen Zahlen "wurden".
     * @param pZahl
     * @return
     */
    private String grammatik(int pZahl) {
        if (pZahl == 1) {
            return "wurde";
        } else {
            return "wurden";
        }
    }
}