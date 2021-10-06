public class Util {
    
    
    /**
     * Generate a random full number between 0 and the specified number. (Upper limit)
     */
    public static int randomInt(int pSides) {
        return (int) Math.round(Math.random() * (pSides - 0));
    }
    
    /**
     * Pauses the program
     * @param pSeconds How long should the program be paused?
     */
    public static void wait(int pSeconds) {
        try {
            Thread.sleep(pSeconds * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    /*public static void start() {
        new Polizist();
    }*/
    
    
    public static void verkehrErstellen(Polizist pPolizist) {
        String[] modelle = {
            "Ford Mustang",
            "Porsche 911",
            "BWM M3 F80",
            "Piaggio Ape",
            "PZKW 3",
            "Lamborghini Murcielago",
            "Toyota Corolla",
            "DeLorean DMC-12",
            "Fiat Multipla",
            "Boeing 747"
        };
        
        String[] farben = {
            "schwarz",
            "rot",
            "gelb",
            "ocker",
            "pink",
            "violett",
            "durchsichtig",
            "weiß",
            "silber",
            "türkis",
            "grün"
        };
        
        String[] kennzeichen = {
            "DVZ5456456",
            "DV35HNG1NF",
            "SDGFB4856R",
            "R5T4GBD1D",
            "D145GD1T52",
            "DFR8564BG",
            "DF56GB46",
            "DR5B45DT",
        };
        for (int i = 0; i < 50; i++) {
            pPolizist.addCar(new Fahrzeug(modelle[randomInt(modelle.length - 1)], farben[randomInt(farben.length - 1)], kennzeichen[randomInt(kennzeichen.length - 1)]));
        }
    }
    
    public static void debug(String pMessage) {
        System.out.println("[DEBUG]" + pMessage);
    }
}