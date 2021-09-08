public class Kampfregel {
    /**
     * Regelt den Kampf.
     * Die Partei mit dem höchsten Angriffswert gewinnt, Helden können ihren AW mithilfe einer Waffe steigern.
     */
    public static void kampf(Held pSpieler, Monster pGegner) {
        // Monster gewinnt
        if (pGegner.getAngriffswert() > pSpieler.angriffswert) {
            if ((pSpieler.getLebenspunkte() - 1) <= 0) {
                System.out.println("Held " + pSpieler.name + " ist tot, Held hat gewonnen.");
                System.out.println("Spiel ist beendet");
            } else {
                pSpieler.lebenspunkteReduzieren();
                Kampfregel.debug("Monster ");
            }

        // Spieler gewinnt
        } else if (pGegner.getAngriffswert() < pSpieler.angriffswert) {
            if ((pGegner.getLebenspunkte() - 1) <= 0) {
                System.out.println("Das Monster ist tot, Held " + pSpieler.name + " hat gewonnen.");
            } else {
                pGegner.lebenspunkteReduzieren();
                Kampfregel.debug("");
            }

        // Keiner gewinnt
        } else {
            throw new Error("Beide Parteien haben den gleichen Angriffswert, (" + pSpieler.angriffswert + ").\nDas Bedeutet, dass es keinen Gewinner geben kann.");
        }
    }

    private static void debug(String pData) {
        System.out.println("[DEBUG]: " + pData);
    }
}
