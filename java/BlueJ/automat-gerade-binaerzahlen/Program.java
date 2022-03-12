public class Program {

    /**
     * Der Zustand des Automaten, entweder `q0` oder `q1`.
     * Wenn der Zustand `q0` ist, ist die zuletzt überprüfte zahl ungerade, wenn er `q1` ist, gerade.
     */
    private static String zustand;
    private static char[] ziffern;

    public static void checkNumber(String pZahl) {
        ziffern = pZahl.toCharArray();

        zustand = "q0";
        
        for (int i = 0; i < ziffern.length; i++) {
            System.out.println("Zustand: " + zustand);

            if (zustand == "q0" && ziffern[i] == '0') {
                zustand = "q1";
            } else if (zustand == "q1" && ziffern[i] == '1') {
                zustand = "q0";
            }
        }

        if (zustand == "q1") {
            System.out.println("Die Zahl " + pZahl + " ist gerade.");
        } else {
            System.out.println("Die Zahl " + pZahl + " ist ungerade.");
        }
    }
}