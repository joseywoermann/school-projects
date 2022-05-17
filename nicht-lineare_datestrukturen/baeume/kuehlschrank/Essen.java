public class Essen implements ComparableContent<Essen> {

     private String name;
     private int gewicht;

     /**
      * Erstellt ein neues Essen mit einem Namen.
      * @param pName
      */
     public Essen(String pName, int pGewicht) {
         this.name = pName;
         this.gewicht = pGewicht;
     }

     /**
      * "größer" = weiter hinten im Alphabet
      */
     public boolean isGreater(Essen pContent) {
          return this.getName().compareTo(pContent.getName()) > 0;
     }

     public boolean isEqual(Essen pContent) {
          return this.getName().compareTo(pContent.getName()) == 0;
     }

     /**
      * "kleiner" = weiter vorne im Alphabet
      */
     public boolean isLess(Essen pContent) {
          return this.getName().compareTo(pContent.getName()) < 0;
     }

     public String getName() {
          return this.name;
     }

     public int getGewicht() {
          return this.gewicht;
     }
}