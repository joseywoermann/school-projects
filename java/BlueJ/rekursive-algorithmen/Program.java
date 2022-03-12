public class Program {

    // ==================================================================
    // addiereX
    // ==================================================================
    
    
    public static int addiereXIterativ(int x) {
        int ergebnis = 0;

        for (int i = 0; i < x; i++) {
            ergebnis += random(6);
        }

        return ergebnis;
    }

    public static int addiereXRekursiv(int x) {
        if (x == 0) return 0;
        
        return (addiereXRekursiv(x - 1) + random(6));
    }
    
    
    // ==================================================================
    // maxFinden
    // ==================================================================
    
    
    public static int maxFindenIterativ(int x) {
        int ergebnis = 0;

        for (int i = 0; i < x; i++) {
            int tmp = random(6);
            if (tmp > ergebnis) {
                ergebnis = tmp;
            }
        }
        return ergebnis;
    }
    
    public static int maxFindenRekursiv(int x) {
        if (x == 0) return 0;

        int gewuerfelt = random(6);
        int vorherigeWerte = maxFindenRekursiv(x - 1);
        

        if (gewuerfelt > vorherigeWerte) {
            return gewuerfelt;
        } else {
            return vorherigeWerte;
        }
    }
    
    
    // ==================================================================
    // gibXErgebnisse
    // ==================================================================
    
    
    public static int gibXErgebnisseIterativ(int x) {
        String ergebnis = "";

        for (int i = 0; i < x; i++) {
            ergebnis += Integer.toString(random(6));
        }

        return Integer.parseInt(ergebnis);
    }
    
    public static int gibXErgebnisseRekursiv(int x) {
        if (x <= 1) return random(6);
        
        String ergebnis = "";
        
        ergebnis = Integer.toString(random(6)) + Integer.toString(gibXErgebnisseRekursiv(x - 1));

        return Integer.parseInt(ergebnis);
    }
    
    
    // ==================================================================
    // andere Sachen
    // ==================================================================
    
    
    /**
     * Würfel
     */
    public static int random(int max) {
        return (int) Math.round(Math.random() * (max - 1));
    }
}