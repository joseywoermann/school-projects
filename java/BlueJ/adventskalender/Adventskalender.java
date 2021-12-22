public class Adventskalender {

    private Queue<Tuerchen> tage;
    private boolean aufgefuellt;

    public Adventskalender() {
        this.tage = new Queue<Tuerchen>();
        this.aufgefuellt = false;
    }

    public void tuerchenOeffnen() {
        if (this.tage.isEmpty()) return;
        Tuerchen t = this.tage.front();

        Util.trennstrich();
        System.out.println("Das " + t.getTag() + ". Türchen beinhaltet: " + t.getInhalt());
        Util.trennstrich();
        
        this.tage.dequeue();
    }

    public void adventskalenderAuffuellen(String[] pInhalte) {
        if (this.aufgefuellt) return;
        if (pInhalte == null || pInhalte.length < 24) return;

        for (int i = 0; i < 24; i++) {
            this.tage.enqueue(new Tuerchen((i + 1), pInhalte[i]));
        }
        this.aufgefuellt = true;
    }

    public void adventskalenderAutomatischAuffuellen() {
        if (this.aufgefuellt) return;

        for (int i = 0; i < 24; i++) {
            this.tage.enqueue(new Tuerchen((i + 1), Util.randomString()));
        }
        this.aufgefuellt = true;
    }
}