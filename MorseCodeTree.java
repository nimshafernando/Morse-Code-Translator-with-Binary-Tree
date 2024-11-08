package milestone2;

import java.util.Stack;

public class MorseCodeTree {
    private TreeNode root;

    public MorseCodeTree() {
        root = new TreeNode(); // Initialize root
    }

    // Inserts a character based on its Morse code into the tree
    public void insert(String morseCode, char character) {
        TreeNode current = root;
        for (char symbol : morseCode.toCharArray()) {
            if (symbol == '.') {
                if (current.left == null) {
                    current.left = new TreeNode();
                }
                current = current.left;
            } else if (symbol == '-') {
                if (current.right == null) {
                    current.right = new TreeNode();
                }
                current = current.right;
            }
        }
        current.character = character;
    }

    // Prints the Morse code dictionary using in-order traversal with a stack
    public void printDictionary() {
        Stack<StackNode> stack = new Stack<>();
        TreeNode current = root;
        String currentMorseCode = "";

        stack.push(new StackNode(current, currentMorseCode));

        while (!stack.isEmpty()) {
            StackNode currentNode = stack.pop();
            TreeNode node = currentNode.node;
            String morseCode = currentNode.morseCode;

            if (node.character != '\0') {
                System.out.println("Character: " + node.character + ", Morse Code: " + morseCode);
            }

            if (node.right != null) {
                stack.push(new StackNode(node.right, morseCode + "-"));
            }

            if (node.left != null) {
                stack.push(new StackNode(node.left, morseCode + "."));
            }
        }
    }

    // Decodes a reversed Morse code message
    public String decode(String morseMessage) {
        StringBuilder decodedMessage = new StringBuilder();
        String[] words = morseMessage.split("/"); // Split words by "/"

        for (String word : words) {
            String[] letters = word.trim().split(" "); // Splits letters by spaces
            for (String letter : letters) {
                decodedMessage.append(decodeLetter(letter)); // Decodes each letter
            }
            decodedMessage.append(" "); // Separates words with a space
        }

        return decodedMessage.toString().trim(); // Returns the decoded message
    }

    // Decodes a single Morse code letter
    private char decodeLetter(String morseCode) {
        TreeNode current = root;
        for (char symbol : morseCode.toCharArray()) {
            if (symbol == '.') {
                current = current.left;
            } else if (symbol == '-') {
                current = current.right;
            }
        }
        return current.character;
    }
}
