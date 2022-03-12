public class LED {
    
    private boolean leuchtet;

    public LED() {
        this.leuchtet = false;
    }

    public void lichtAn() {
        this.leuchtet = true;
    }
    
    public void lichtAus() {
        this.leuchtet = false;
    }
    
    public boolean istAn() {
        return this.leuchtet;
    }
}