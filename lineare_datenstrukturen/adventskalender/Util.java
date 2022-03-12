public class Util {

    public static void adventskalenderAutomatischAuffuellen(Adventskalender pAdventskalender) {
        pAdventskalender.adventskalenderAutomatischAuffuellen();
    }

    public static String randomString() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += chars.charAt(Util.randomInt(chars.length() - 1));
        }

        return str;  
    }

    public static int randomInt(int pSides) {
        return (int) Math.round(Math.random() * (pSides - 0));
    }

    public static void trennstrich() {
        System.out.println("=====================================");
    }

    private String[] example = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x" };
}