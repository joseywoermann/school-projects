public class Tuerchen {
    
    private int tag;
    private String inhalt;

    public Tuerchen(int pTag, String pInhalt) {
        this.tag = pTag;
        this.inhalt = pInhalt;
    }

    public int getTag() {
        return this.tag;
    }

    public String getInhalt() {
        return  this.inhalt;
    }
}