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
    
    /**
     * Füllt die Straßen-Queue mit 50 zufällig generierten Fahrzeugen
     * @param pPolizist Der Polizist, der die Straße kontrollieren soll
     */
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
            "Boeing 747",
            "McDonnell Douglas F/A-18",
            "Saturn V",
            "VW Polo",
            "Tiger I",
            "Ferrari F12",
            "Bentley Continental",
            "Mercedes-Benz Silberpfeil",
            "Boeing B-52",
            "Bell Boeing V-22 Osprey",
            "Mark I",
            "Gorch Fock",
            "Panzer IV",
            "Opel Astra",
            "Audi RS6",
            "BMW i8",
            "Tesla Model X",
            "Tesla Cybertruck",
            "Komatsu PC240LC/NLC-11",
            "Messerschmitt Bf 109",
            "Junkers Ju 87"
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
            "grün",
            "regenbogen",
            "grau",
            "ultraviolett",
            "neon-pink"
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
            "RTZ2H15RZT6",
            "000",
            "KLJRGT9873465t",
            "D4856TZ46DT4Z",
            "RB56468534",
            "THN8T56EZ4ETZ",
            "BI-LH-102",
            "GT-OQ-1355",
            "GT-YI-713"
        };
        for (int i = 0; i < 50; i++) {
            String modell = modelle[randomInt(modelle.length - 1)];
            String farbe = farben[randomInt(farben.length - 1)];
            String kennzeichen2 = kennzeichen[randomInt(kennzeichen.length - 1)];

            pPolizist.addCar(new Fahrzeug(modell, farbe, kennzeichen2));
        }
    }
}