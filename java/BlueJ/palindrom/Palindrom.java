public class Palindrom {
    
    /**
     * Gibt an, ob der String ein Palindrom ist.
     * @param pText Der zu überprüfende String
     * @return {@code true} wenn der String ein Palindrom ist, sonst {@code false}.
     */
    public static boolean check(String pText) {
        String original = pText.toLowerCase();
        String reversedText = "";
        Stack<Character> characters = new Stack<Character>();
        
        // Stack aufbauen
        for (int i = 0; i < original.length(); i++) {
            characters.push(original.charAt(i));
        }
        
        // Stack abbauen
        while (!characters.isEmpty()) {
            reversedText += characters.top();
            characters.pop();
        }
        
        return reversedText.equals(original);
    }

    public static void checkWithUI(String pText) {
        if (Palindrom.check(pText)) {
            System.out.println(pText + " ist ein Palindrom.");
        } else {
            System.out.println(pText + " ist kein Palindrom.");
        }
    }
}
