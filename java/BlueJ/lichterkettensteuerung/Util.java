public class Util {

    /**
     * Erstellt automatisch eine Lichterkette mit spezifizierter Länge und fügt sie zur spezifizierten Steuerung hinzu.
     * @param pAnzahl
     * @param pSteuerung
     */
    public static void lichterketteErstellen(int pAnzahl, Steuerung pSteuerung) {
        List<LED> lichterkette = new List<LED>();
        for (int i = 0; i < pAnzahl; i++) {
            lichterkette.append(new LED());
        }
        pSteuerung.lichterketteAnhaengen(lichterkette);
    }
}