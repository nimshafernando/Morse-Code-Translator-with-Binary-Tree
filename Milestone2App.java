package milestone2;

public class Milestone2App {

    public static void main(String[] args) {

        MorseCodeTree morseTree = new MorseCodeTree();

        
        String[] codes = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        char[] characters = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        //Populates the Morse tree
        for (int i = 0; i < characters.length; i++) {
            morseTree.insert(codes[i], characters[i]);
        }

        //Prints the Morse code dictionary (character to Morse code mapping)
        System.out.println("Morse Code Dictionary:");
        morseTree.printDictionary();

        //Uses the provided sample text (Morse code message which was provided in the LMS in the sample text file)
        String sampleMessage = "/ -- . ..-. ...- --- .-. .--./ . .... -/ . -... ..-. --- .../ - ... .-. .. .-..";

        // Validation 1: Checks if the message is empty or null
        if (sampleMessage == null || sampleMessage.trim().isEmpty()) {
            System.out.println("Error: The Morse code message is empty.");
            return; 
        }

        // Validation 2: Checks if the message contains only valid Morse code characters (., -, /, space)
        if (!isValidMorseMessage(sampleMessage)) {
            System.out.println("Error: The Morse code message contains invalid characters.");
            return; 
        }

        //Prints Original Morse Code
        System.out.println("Original Morse Code: " + sampleMessage);

        //Reverses the Morse code message
        String reversedMessage = new StringBuilder(sampleMessage).reverse().toString();
        System.out.println("Reversed Morse Code: " + reversedMessage);

        //Decodes the reversed message using the Morse tree
        String decodedMessage = morseTree.decode(reversedMessage);

        //Prints the decoded message
        System.out.println("Decoded Message: " + decodedMessage);
    }

    // Validation Method to check for valid Morse code characters
    public static boolean isValidMorseMessage(String morseMessage) {
        for (char c : morseMessage.toCharArray()) {
            if (c != '.' && c != '-' && c != ' ' && c != '/') {
                return false; // Invalid character found
            }
        }
        return true; // All characters are valid
    }
}
