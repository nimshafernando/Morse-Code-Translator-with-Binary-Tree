package milestone2;

public class StackNode {
    TreeNode node;      // The Morse tree node
    String morseCode;   // Morse code sequence for printing

    public StackNode(TreeNode node, String morseCode) {
        this.node = node;
        this.morseCode = morseCode;
    }
}
