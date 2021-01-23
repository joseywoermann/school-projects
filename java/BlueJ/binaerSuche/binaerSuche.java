public class binaerSuche {

  public binaerSuche() {

  }

  public boolean binaereSuche(int[] exampleArray, int suchschluessel) {

    int links;
    int rechts;
    int mitte;

    rechts = exampleArray[exampleArray.length-1];

    while (links <= rechts) {
      mitte = /*random int between rechts und links*/;

      if (exampleArray[mitte] == suchschluessel) {
        return true;
      }
      if (exampleArray[mitte] < suchschluessel) {
        links = mitte + 1;
      }
      if (exampleArray[mitte] > suchschluessel) {
        rechts = mitte - 1;
      }
    }
  }
}
