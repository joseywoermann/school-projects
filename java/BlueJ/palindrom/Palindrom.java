public class Palindrom {

    public static boolean check(String pText) {

        String original = pText;
        String reversedText = "";

        Stack<Character> characters = new Stack<Character>();
        
        for (int i = 0; i < original.length(); i++) {
            characters.push(original.charAt(i));
        }

        while (!characters.isEmpty()) {
            reversedText += characters.top();
            characters.pop();
        }
        
        return reversedText.equals(original);
    }
}