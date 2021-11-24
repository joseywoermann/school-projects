public class Einkaufsliste {

    private List<String> liste = new List<String>();

    public Einkaufsliste() {

    }

    public void addEntry(String pItem) {
        this.liste.append(pItem);
    }

    public void removeEntry(String pItem) {
        // Überprüfen, ob das Element in der Liste ist
        if (this.liste.isEmpty()) return;
        if (!this.checkEntry(pItem)) return;
    
        // Letztes Element abspeichern um Endpunkt festzulegen
        this.liste.toLast();
        String firstEntry = this.liste.getContent();
        this.liste.toFirst();

        // Solange der Endpunkt nicht erreicht ist, Element prüfen
        while (this.liste.getContent() != firstEntry) {
            if (this.liste.getContent().equals(pItem)) {
                this.liste.remove();
            }
            this.liste.next();
        }
        // Endpunkt prüfen
        this.liste.toLast();
        if (this.liste.getContent().equals(pItem)) {
            this.liste.remove();
        }
    }

    public void showList() {
        if (this.liste.isEmpty()) return;
        
        // Solange der Endpunkt nicht erreicht ist, Element ausgeben
        this.liste.toFirst();
        while (this.liste.current != this.liste.last) {
            System.out.println(this.liste.getContent());
            this.liste.next();
        }
        
        // Endpunkt ausgeben
        this.liste.toLast();
        System.out.println(this.liste.getContent());
    }

    public boolean checkEntry(String pItem) {
        if (this.liste.isEmpty()) return false;
        boolean found = false;
        // Letztes Element abspeichern um Endpunkt festzulegen
        this.liste.toLast();
        String lastEntry = this.liste.getContent();
        this.liste.toFirst();

        // Solange der Endpunkt nicht erreicht ist, Element prüfen
        while (this.liste.getContent() != lastEntry) {
            if (this.liste.getContent().equals(pItem)) {
                found = true;
            }
            this.liste.next();
        }
        // Endpunkt prüfen
        this.liste.toLast();
        if (this.liste.getContent().equals(pItem)) {
            found = true;
        }
        return found;
    }   
}